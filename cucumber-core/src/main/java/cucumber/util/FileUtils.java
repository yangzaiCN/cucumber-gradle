package cucumber.util;

import java.io.*;

/**
 * Created by zhangyang6 on 2017/9/13.
 */
public class FileUtils {

    public static void writeObject(Object object){
        File file = new File(System.getProperty("user.dir"), "/build/");
        if (!file.exists()) {
            boolean mkdirs = file.mkdirs();
            System.out.println("mkdirs :" + mkdirs);
        }
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file +  "/feature"  );
            oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            IOUtils.closeQuietly(fos,oos);
        }
    }

   public static Object readObject(String name){
        File file = new File(System.getProperty("user.dir"), "/build");
        if (!file.exists()) {
            file.mkdirs();
        }
        Object object = null;
        File target = new File(file + "/" + name);
        if (!target.exists()) {
            throw new RuntimeException("Object file not found >> " + target.getAbsolutePath());
        }
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(target);
            ois = new ObjectInputStream(fis);
            try {
                object = ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(fis,ois);
        }
        return object;
    }

}
