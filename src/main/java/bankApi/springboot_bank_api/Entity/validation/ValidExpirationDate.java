package bankApi.springboot_bank_api.Entity.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ExpirationDateValidator.class)
public @interface ValidExpirationDate {
    String message() default "Invalid expiration date format (mm/yy)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
