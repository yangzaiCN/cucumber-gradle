package cucumber.runtime.annotations;

import cucumber.api.Transform;
import cucumber.runtime.ParameterInfoTest.FortyTwoTransformer;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
@Documented
@Transform(FortyTwoTransformer.class)
public @interface TransformToFortyTwo {

}
