package com.epam.LambdasandStreams;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class PalindromeStrings {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n;
		Predicate<String> inputstring=PalindromeStrings::isPalindrome;
		System.out.print("Enter number of Strings:");
		n=s.nextInt();
		List<String> stringlist=new ArrayList<String>();
		List<String> palindrome;
		System.out.println("Enter strings");
		for(int iter=1;iter<=n;iter++)
		{
			stringlist.add(s.next());
		}
		palindrome=stringlist.stream().filter(inputstring).collect(Collectors.toList());
		
		System.out.println(palindrome);
		s.close();
	}
	public static boolean isPalindrome(String inp) {
		return inp.equalsIgnoreCase(new StringBuffer().append(inp).reverse().toString());
	}
}
