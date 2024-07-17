package com.example.validationdemo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target( {ElementType.FIELD, ElementType.METHOD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    public String value() default "LUV";

    public String message() default "must starts with LUV";

    // define default groups
    public Class<?>[] groups() default {};

    // define default payload
    public Class<? extends Payload>[] payload() default {};
}
