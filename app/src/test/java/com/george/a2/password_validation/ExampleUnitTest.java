package com.george.a2.password_validation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void checkNotPassword() throws Exception {
        Validator validator = new Validator();
        assertEquals(2  , validator.validate("pasward"));
    }
    @Test
    public void checkLength() throws Exception {
        Validator validator = new Validator();
        assertEquals(3  , validator.validate("passward"));
    }
    @Test
    public void checkPassword() throws Exception {
        Validator validator = new Validator();
        assertEquals(2  , validator.validate("password"));
    }
    @Test
    public void checknum() throws Exception {
        Validator validator = new Validator();
        assertEquals(4  , validator.validate("password1"));
    }
    @Test
    public void checkEmpty() throws Exception {
        Validator validator = new Validator();
        assertEquals(4  , validator.validate("passward1"));
    }
    @Test
    public void checkSpecial() throws Exception {
        Validator validator = new Validator();
        assertEquals(5  , validator.validate("passward1*"));
    }


}