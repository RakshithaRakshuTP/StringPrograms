package com.Section3Programming.pack;

public class LargestPalindromwordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		split("wow that madam knows malayalam");
		

	}
	
	public static void split(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		String [] str1Array=new String[count+1];
		int index=0;
		int startIndex=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				str1Array[index]=str.substring(startIndex,i);
				startIndex=i+1;
				index++;
			}
		}
		str1Array[index]=str.substring(startIndex);	
		String [] revArray =new String[str1Array.length];
		for(int i=0;i<str1Array.length;i++)
		{	String rev="";
			char [] revChar = str1Array[i].toCharArray();
			for(int j=revChar.length-1;j>=0;j--)
			{
				rev=rev+revChar[j];
				
			}
			revArray[i]=rev;
		}
		
		int countPalindrom=0;
		for(int i=0;i<revArray.length;i++)
		{
			if(revArray[i].equals(str1Array[i]))
			{
				
				countPalindrom++;
				
			}
		}
		
		int paliIndex=0;
		String Palindrom[] =new String[countPalindrom];
		for(int i=0;i<revArray.length;i++)
		{
			if(revArray[i].equals(str1Array[i]))
			{
				Palindrom[paliIndex]=revArray[i];
				paliIndex++;
			}
		}
		
		String temp="";
		for(int i=0;i<Palindrom.length;i++)
		{
			for(int j=1;j<Palindrom.length;j++)
			{
				if(Palindrom[i].length()<Palindrom[j].length())
				{
					temp=Palindrom[i];
					Palindrom[i]=Palindrom[j];
					Palindrom[j]=temp;
				}
			}
		}
System.out.println(Palindrom[0]);
		}
	}
