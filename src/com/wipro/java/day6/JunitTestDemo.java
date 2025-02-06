package com.wipro.java.day6;

/*
 Try to implement & test for add method by 
 using assertEquals or assertnotEquals 
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class getAdd {
    public static int add(int a, int b) {
        return a+b;
    }
}
public class JunitTestDemo {
	static int i=1,j=1;
	 @BeforeEach
	public void getBefore() {
		System.out.println("Before test....."+i++);
	}
	@AfterEach
    public void getNext() {
        System.out.println("After test..."+j++);
    }
    @Test
    public void addTest() {
    	System.out.println("Inside test1...");
        assertEquals(8,getAdd.add(5, 3));
        assertNotEquals(8,getAdd.add(2, 3));
    }
	@Test
	public void addTest2() {
		System.out.println("Inside test2...");
        assertEquals(8,getAdd.add(5, 5));
        assertNotEquals(8,getAdd.add(5, 3));
	}
}
