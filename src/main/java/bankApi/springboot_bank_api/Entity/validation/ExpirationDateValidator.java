package bankApi.springboot_bank_api.Entity.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class ExpirationDateValidator implements ConstraintValidator<ValidExpirationDate, String> {
    private static final String EXPIRATION_DATE_FORMAT = "MM/yy";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || !Pattern.compile("(0[1-9]|1[0-2])/[0-9]{2}").matcher(value).matches()) {
            return false; // Invalid format
        }

        try {
            SimpleDateFormat sdf = new SimpleDateFormat(EXPIRATION_DATE_FORMAT);
            sdf.setLenient(false); // Strict parsing
            Date expirationDate = sdf.parse(value);
            return expirationDate.after(new Date()); // Check if future date
        } catch (Exception e) {
            return false; // Parsing error
        }
    }
}
