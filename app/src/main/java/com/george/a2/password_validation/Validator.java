package com.george.a2.password_validation;

/**
 * Created by GEORGE on 2018-02-07.
 */

public class Validator {

    public int validate(String s){

        int ret=0;
        //checking 2 rules
        if(!(s.toLowerCase().equals("password")))
            ret++;
        if(!(s.length()<8))
            ret++;

        return ret;
    }

}
