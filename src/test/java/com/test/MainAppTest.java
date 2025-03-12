package com.test;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.MainApp;

public class MainAppTest {
    MainApp map = null;

    @Before
    public void before() {
        map = new MainApp();
    }

    @After
    public void after() {
        map = null;
    }

    @Test
    public void testWithPositive() {
        assertEquals(14, map.addition(7, 7));
    }

    @Test
    public void testWithNegative() {
        assertEquals(-14, map.addition(-2, -2));
    }
}
