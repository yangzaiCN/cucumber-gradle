package cucumber.runtime.annotations;

import cucumber.api.Delimiter;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
@Documented
@Delimiter(",!,")
public @interface CustomDelimiter {

}
