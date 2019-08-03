package com.train.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Ignore("Not ready for test")
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
