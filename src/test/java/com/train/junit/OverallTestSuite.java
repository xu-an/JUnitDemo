package com.train.junit;
 
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
 
@RunWith(Suite.class)
@Suite.SuiteClasses({
    CalculatorTest.class, 
    BasicTestSuite.class
})
public class OverallTestSuite {
    // the class remains empty,
    // used only as a holder for the above annotations
}