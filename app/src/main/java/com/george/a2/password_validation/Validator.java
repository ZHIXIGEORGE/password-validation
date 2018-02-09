package com.george.a2.password_validation;

/**
 * Created by GEORGE on 2018-02-07.
 */
import java.util.regex.Pattern;

public class Validator {

    public int validate(String s){

        int ret=0;
        if(!(s.toLowerCase().equals("password")))
            ret++;
        if(!(s.length()<8))
            ret++;
        if(Pattern.matches(".*\\d.*", s))//check does it contain a number or not
            ret++;
        if(Pattern.matches(".*\\W.*", s))//check does it contain a special character or not
            ret++;
        if(!s.isEmpty())
            ret++;

        return ret;
    }

}
