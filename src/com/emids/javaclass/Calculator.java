package com.emids.javaclass;

public class Calculator {
	public static int add(String numbers) {
		 String delimeter = ",|\n|;";

		String[] numbersArray = numbers.split(delimeter);

	
		if (numbersArray.length == 0)
			return 0;
		int sum = 0;
		for (String number : numbersArray) {
			char[] arr = number.toCharArray();
			String num = "";
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= '0' && arr[i] <= '9')
				{
					num = num + arr[i];
				}
			}
			int digit = Integer.parseInt(num);
			sum = sum + digit;
		}
		
		return sum;
		}
}