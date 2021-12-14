package com.litvishko.spring.mvc.emailAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {

    private String endEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        endEmail = checkEmail.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.endsWith(endEmail);
    }
}
