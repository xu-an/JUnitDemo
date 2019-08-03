package com.train.junit;
 
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
 
@RunWith(Suite.class)
@Suite.SuiteClasses({
    AppTest.class, 
    AssertTest.class
})
public class BasicTestSuite {
    // the class remains empty,
    // used only as a holder for the above annotations
}