package org.example;

import org.junit.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @BeforeClass
    public static void init() {
        System.out.println("class init");
    }

    @Before
    public void testInit() {
        System.out.println("test init");
    }

    @Test
    public void testAdd() {
        int sum = calculator.add(4, 5);
        Assert.assertEquals(9, sum);
        sum = calculator.add(0, 5);
        Assert.assertEquals(5, sum);
    }

    @Test
    public void testSubtract() {
        int res = calculator.subtract(4, 5);
        Assert.assertEquals(-1, res);
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("class tearDown");
    }

    @Before
    public void testTearDown() {
        System.out.println(" test TearDown");
    }

}
