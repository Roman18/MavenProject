package com.company.Homework13.Validator;

import com.company.Homework13.Rules.ValidatorRule;
import com.company.Homework13.ValidationException;

import java.util.List;

public class RulesBasedObjectValidator <T> implements ObjectValidator<T> {
    private List<ValidatorRule> list;

    public RulesBasedObjectValidator(List<ValidatorRule> list){
        this.list=list;

    }
    @Override
    public void validator(T t) throws ValidationException {
        for (int i = 0; i <list.size() ; i++) {
            if (!list.get(i).validate(t)){
                throw new ValidationException(list.get(i).errorMessage());
            }
        }
    }
}
