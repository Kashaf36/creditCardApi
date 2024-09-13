package bankApi.springboot_bank_api.Entity.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;


@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)

@Documented
@Constraint(validatedBy = ValidCardTypeValidator.class)
public @interface ValidCardType {
    String message() default "Invalid card type";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}


