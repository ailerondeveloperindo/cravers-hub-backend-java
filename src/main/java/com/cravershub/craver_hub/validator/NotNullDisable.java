package com.cravershub.craver_hub.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = { NotNullDisableValidator.class })
public @interface NotNullDisable {
    String message() default "Should not be null/empty";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
