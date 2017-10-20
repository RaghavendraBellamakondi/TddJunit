package com.emids.javaclass;

public class Calculator {
public static int  add(String numbers)
	{
		String[] numbersArray=numbers.split(",");
		
		if(numbersArray.length==0)
			return 0;
		else
		{
			int sum=0;
		for (String number : numbersArray) {
			int digit=Integer.parseInt(number);
					sum+=digit;
		}
		return sum;
		}
	}

}
