package com.Section3Programming.pack;
import java.util.*;

public class ReversingWordsInArrayOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter your String");
		String inputString=ob.nextLine();
		
		String[]wordsArray=split(inputString);
//		for(String i: wordsArray) 
//		{
//			System.out.println(i);
//		}
		System.out.println(reversString(wordsArray));
		
	}
	
	
	//Split method
	public static String[] split(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
			{
				count++;
			}
			
		}
		System.out.println(count);

		String []wordsArray = new String[count+1];
		//inbuilt method
     	//wordsArray=str.split(" "); 
		int startindex=0;
		int index=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				//using inbuilt method 
				//wordsArray[index]=str.substring(startindex,i);
				//using user defined method
				wordsArray[index]=substring(str,startindex,i);
				startindex=i+1;
				index++;
			}
		}
		//using inbuilt method 
		//wordsArray[index]=str.substring(startindex,str.length()); 
		//using user defined method
		wordsArray[index]=substring(str,startindex,str.length());
		
		return wordsArray;
		
		
		
	}
	
	//Substring method
	public static String substring(String s,int startindex,int endindex) {
		int length=endindex-startindex;
		char []ressubstring=new char[length];
		if(startindex< 0||startindex>endindex||startindex==s.length())
		{
			return "";
		}
		int index=0;
		for(int i=startindex;i<endindex;i++)
		{
			ressubstring[index]=s.charAt(i);
			index++;
		}
		return new String(ressubstring);
	}
	//Reversing the String
	public static String reversString(String[] wordsArray)
	{
		StringBuffer revString=new StringBuffer();
		
		
		for(int i=0;i<wordsArray.length;i++)
		{	 
			String temp=wordsArray[i];
			StringBuffer revword=new StringBuffer();
			for(int j=temp.length()-1;j>=0;j--)
			{
				revword=revword.append(temp.charAt(j));
			}
			revString=revString.append(revword);
			if(i<wordsArray.length)
			{
				revString=revString.append(" ");
			}
		}
		return new String(revString);
	}
	
}
