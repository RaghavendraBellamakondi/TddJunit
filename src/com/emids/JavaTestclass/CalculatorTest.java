package com.emids.JavaTestclass;

import org.junit.Assert;
import org.junit.Test;

import com.emids.javaclass.Calculator;

public class CalculatorTest {

	@Test
	public final void methodmusttakeinputnumberssepartedbycomma() {
		Calculator.add("1,2,3");
	}

	@Test
	public final void whentheinputStringisemptyThenitreturnszero() {
		Calcutor.add("");
		Assert.assertEquals(0, Calcutor.add(""));
	}
	
	@Test
	public final void whenmultiplenumbersThenitmusthandleallthoseandgivethesum() {
		Calcutor.add("1,2,3,4,5,6");
		Assert.assertEquals(21, Calcutor.add("1,2,3,4,5,6"));
	}
	@Test
	public final void wheninputisgivenwiththenewlinedelimiterThenitmustreturnsthesumofthosenumbers() {
		Calcutor.add("");
		Assert.assertEquals(3, Calcutor.add("1\n2"));
	}
	@Test
	public final void whenthenumbersaresaparatedbyundefineddelimiterThenalsoitmustwork() {
		Calcutor.add("1,2;3,4,5,6");
		Assert.assertEquals(21, Calcutor.add("1,2;3,4,5,6"));
	}
	@Test(expected=RuntimeException.class)
	public final void whennegetivenumberarethereininputThenitthorwsexception() {
		Calcutor.add("1,-2,2,3,4,5,6");
		
	}
	@Test
	
	public final void wheninputismorethanthousandThenitmustigone() {
		Calcutor.add("");
		Assert.assertEquals(10, Calcutor.add("1,2,3,4,1000"));
	}
	
}
