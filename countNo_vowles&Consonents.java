package com.Section3Programming.pack;
import java.util.Scanner;

public class Program2 {
		
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=ob.nextLine();
		
		countVowelsConsonents(s);
		
		
		
	}
	public static void countVowelsConsonents(String s)
	{	char s1;
		int no_vowels=0;
		int no_consonents=0;
		for(int i=0;i<s.length();i++) 
		{
			  s1 = s.charAt(i);
			if(s1=='a'||s1=='A'||s1=='e'||s1=='E'||s1=='i'||s1=='I'||s1=='o'||s1=='O'||s1=='u'||s1=='U')
			{
				no_vowels++;
			}
			else 
			{
				if(s1!=' ') {
					no_consonents++;
					
				}
			}
		}
		
		System.out.println("The no of Vowels:"+no_vowels);
		System.out.println("The no of COnsonents:"+no_consonents);
	}
	
	
}
