package com.company.Homework13.Rules;



public interface ValidatorRule<T> {
    boolean validate(T t);
    String errorMessage();
}
