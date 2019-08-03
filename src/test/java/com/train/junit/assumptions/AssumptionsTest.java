package com.train.junit.assumptions;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeThat;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

public class AssumptionsTest {

    public static boolean flag = false;

    @Test
    public void shouldFail()
    {
        assumeThat(AssumptionsTest.flag, is(true));
        fail();
    }

    @Test
    public void flagShouldBeTrue()
    {
        assumeTrue(AssumptionsTest.flag);
        assertTrue(AssumptionsTest.flag);
    }

    @Test
    public void flagShouldBeFalse()
    {
        assertFalse(AssumptionsTest.flag);
    }
}