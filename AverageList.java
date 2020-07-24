package com.epam.LambdasandStreams;
import java.util.*;
import java.text.DecimalFormat;
public class AverageList {
	private static DecimalFormat df = new DecimalFormat("#.##");
	public static void main(String args[]) {
	int n,sum=0;
	Scanner s=new Scanner(System.in);
	List<Integer> avglist=new ArrayList<Integer>();
	System.out.println("Enter number of elements:");
	n=s.nextInt();
	System.out.print("---Enter elements---");
	for(int iter=0;iter<n;iter++) {
		avglist.add(s.nextInt());
	} 
	for(int suml:avglist) {
		sum+=suml;
	}
	System.out.println("Average of the elements : "+(df.format((double)sum/n)));
	s.close();
}
}