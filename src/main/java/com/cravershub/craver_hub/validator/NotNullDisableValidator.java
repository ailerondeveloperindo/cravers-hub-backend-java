package com.cravershub.craver_hub.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NotNullDisableValidator implements ConstraintValidator<NotNullDisable,String> {
    @Override
    public void initialize(NotNullDisable constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value==null)
        {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Please provide a value").addConstraintViolation();
            return false;
        }
        else {
            return true;
        }

    }
}
