package com.tns.goshopping;

public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "ratan";
		System.out.println(s1.compareTo(s2)); //0
		System.out.println(s1.compareTo(s3)); //1(because s1<s3)
		System.out.println(s3.compareTo(s1)); //-1(because s3<s1)

		
		

	}

}
