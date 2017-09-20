package cucumber.api.java.en;

import cucumber.runtime.java.StepDefAnnotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@StepDefAnnotation
@Documented
public @interface When {
    /**
     * @return a regular expression
     */
    String value();

    /**
     * @return max amount of milliseconds this is allowed to run for. 0 (default) means no restriction.
     */
    long timeout() default 0;
}

