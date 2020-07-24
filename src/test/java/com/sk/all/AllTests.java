package com.sk.all;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sk.datastructures.LinearSearch_IntegerTest;
import com.sk.datastructures.LinearSearch_StringTest;

@RunWith(Suite.class)
@SuiteClasses({ MyTest.class, LinearSearch_IntegerTest.class, LinearSearch_StringTest.class })
public class AllTests {

}