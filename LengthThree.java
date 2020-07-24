package com.epam.LambdasandStreams;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.*;
public class LengthThree {

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n;
		List<String> strings=new ArrayList<String>();
		List<String> lengththree;
		System.out.print("Enter no of Strings : ");
		n=s.nextInt();
		System.out.println("Enter strings");
		for(int iter=0;iter<n;iter++)
		{
			strings.add(s.next());
		}
		lengththree=getStringsLengthThree(strings);
		
		System.out.println(lengththree);
		s.close();
	}
	public static List<String> getStringsLengthThree(List<String> st)
	{
		Predicate<String> predicate = (str)->str.length()==3&&str.startsWith("a");
		List<String> result;
		result=st.stream().filter(predicate).collect(Collectors.toList());
		return result;
	}
}