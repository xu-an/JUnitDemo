package com.train.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AssertTest {
   @Test
   public void testSetup() {
      String str= "I am done with Junit setup";
      assertEquals("I am done with Junit setup", str);
   }
}