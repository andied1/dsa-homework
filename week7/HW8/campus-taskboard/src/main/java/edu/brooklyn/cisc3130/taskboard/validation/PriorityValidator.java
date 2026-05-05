package edu.brooklyn.cisc3130.taskboard.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class PriorityValidator implements ConstraintValidator<ValidPriority, String> {

    private final List<String> allowedValues = Arrays.asList(
            "LOW",
            "MEDIUM",
            "HIGH"
    );

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // Allow null values (you can change this if you want to force a value)
        if (value == null) {
            return true;
        }

        return allowedValues.contains(value.toUpperCase());
    }
}