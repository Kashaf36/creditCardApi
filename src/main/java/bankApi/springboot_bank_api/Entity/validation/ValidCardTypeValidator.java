package bankApi.springboot_bank_api.Entity.validation;

import bankApi.springboot_bank_api.Entity.CardType;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class ValidCardTypeValidator implements ConstraintValidator<ValidCardType, CardType> {

    private List<CardType> validCardTypes;

    @Override
    public void initialize(ValidCardType constraintAnnotation) {
        validCardTypes = Arrays.asList(CardType.MASTERCARD, CardType.VISACARD, CardType.DISCOVER);
    }

    @Override
    public boolean isValid(CardType value, ConstraintValidatorContext context) {
        return value != null && validCardTypes.contains(value);
    }
}