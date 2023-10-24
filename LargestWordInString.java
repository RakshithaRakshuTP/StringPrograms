package com.Section3Programming.pack;

public class LargestWordInString {
	public static String[] split(String str)
	{	
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ') 
			{
			count++;
		    }
		}
		String[] strArray=new String[count+1];
		int startindex=0;
		int index=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				strArray[index]=str.substring(startindex,i);
				startindex=i+1;
				index++;
			}
		}
		strArray[strArray.length-1]=str.substring(startindex,str.length());
		return strArray;
	}
	public static String largeWordInString(String str)
	{
		
		
		String[] checkArray=split(str);
		for(int i=0;i<checkArray.length;i++)
		{
			for(int j=1;j<checkArray.length;j++) 
			{
			String temp="";
			if(checkArray[i].length()< checkArray[j].length())
			 	{
					temp=checkArray[i];
					checkArray[i]=checkArray[j];
					checkArray[j]=temp;
			 	}
			}
				
		}
		
		return checkArray[0];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("hi rakshitha how are you");
		System.out.println(largeWordInString(str));
		

	}

}
