package com.codehub;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *Note Both operands associated with the bitwise operator must be integers.
 */
public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
    	assertTrue(App.isPowerOfTwo(4));

    	assertFalse(App.isPowerOfTwo(99));

    	BigInteger big = new BigInteger("2");

	    assertTrue(App.isPowerOfTwo(big.pow(111).intValue()));
    }

    @Test
	public void Long_Circuit_Evaluation(){
	   // If you use a bitwise operator in a boolean expression, both operands are always evaluated.
	    go_Long_Circuit_Evaluation();
    }

	public boolean showFalse() {
		System.out.println("False!");
		return false;
	}

	public void go() {
		System.out.println("Foo!");
		if(true && showFalse()) {
			// huzzah
		}
		System.out.println("Bar!");
	}

	public void go_Long_Circuit_Evaluation() {
		System.out.println("Foo!");
		if(false & showFalse()) {
			//huzzah
		}
		System.out.println("Bar!");
	}


	@Test
	public void multiply_two(){
    	assertEquals(8, 4 << 1); // 4*2
	}

	@Test
	public void multiply_four(){
		assertEquals(16, 4 << 2 ); // 4*4
	}

	@Test
	public void divide_two(){
		assertEquals(2, 4 >> 1); // 4/2
	}
}
