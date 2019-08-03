package com.train.junit.categories;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;

@RunWith(Categories.class)
@IncludeCategory(SlowTests.class)
// @ExcludeCategory(FastTests.class)
@SuiteClasses( { A.class, B.class }) // 注意Categories 是一种套件 
public class SlowTestSuite {
// 将运行A.b ，但不运行A.a和B.c
}
