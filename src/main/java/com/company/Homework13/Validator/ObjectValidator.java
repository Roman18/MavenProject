package com.company.Homework13.Validator;


import com.company.Homework13.ValidationException;

public interface ObjectValidator <T> {
    void validator(T t) throws ValidationException;
}
