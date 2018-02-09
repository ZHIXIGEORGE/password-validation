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
        assertEquals(1  , validator.validate("pasward"));
    }
    @Test
    public void checkLength() throws Exception {
        Validator validator = new Validator();
        assertEquals(2  , validator.validate("passward"));
    }
}