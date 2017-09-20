package cucumber.runtime.annotations;

import cucumber.api.Format;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
@Documented
@Format("yyyy-MM-dd'T'HH:mm:ss")
public @interface SampleDateFormat {

}
