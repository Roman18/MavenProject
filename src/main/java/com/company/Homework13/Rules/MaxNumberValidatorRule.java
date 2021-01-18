package com.company.Homework13.Rules;



public class MaxNumberValidatorRule implements ValidatorRule<Number> {
    private Number number;
    public MaxNumberValidatorRule(Number number){
        this.number=number;
    }
    @Override
    public boolean validate(Number n){
return number.intValue()>n.intValue();
    }


    @Override
    public String errorMessage() {
        return "the argument is greater than the maximum value";
    }
}
