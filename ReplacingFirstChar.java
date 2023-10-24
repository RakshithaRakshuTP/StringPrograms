package com.Section3Programming.pack;

public class ReplacingFirstChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceFirstChar("hello friends how are you"));

	}
	public static String replaceFirstChar(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{	
			count++;
			}
	   }
	int	index=0;
	int startindex=0;
	//Dividing the Single String into words and storing them in a single String array
	 String[] strarray=new String[count+1];
	 for(int i=0;i<str.length();i++)
	 {
		 if(str.charAt(i)==' ')
		 {
		 strarray[index]=str.substring(startindex,i);
		 startindex=i+1;
		 index++;
		 }
	 }
	 strarray[index]=str.substring(startindex);//Storing last word into last index
	 
	 //Creating another  String array to Store the first character changed words
	 String[]resultarray=new String[strarray.length];
	 for(int i=0;i<strarray.length;i++)
	 {
		 char [] chararray=new char[strarray[i].length()];//creating char array of length = to length of the word 
		 
		 if(i<strarray.length-1) //for example when Strarray.length()=3,
			 					//when i=2, i+1=3 where it will be equal to length of the String array
			 					//and where that Strarray[3] will be not present so it eill give exception 
			 					
		{
			 char [] chararray2=new char[strarray[i+1].length()];//this will give exception if above if condition not present
			 chararray2=strarray[i+1].toCharArray();//Storing next word's all characters into char array2
			 chararray=strarray[i].toCharArray();//Storing current word's all characters into char array2
			 chararray[0]=chararray2[0];//reAssigning the first character of next word as first character of current word 
			 String result=new String(chararray);//creating variable to convert fchar changed character array into String
			 resultarray[i]=result;//Storing it in a String array
		 }
		 resultarray[resultarray.length-1]=strarray[strarray.length-1];//Storing last word directly into 
		 //result why bez there will be no next word to replace first character 
		 }
	 
	   String finalResultString =new String();
	   for(int i=0;i<resultarray.length;i++)
	   {
		   finalResultString= finalResultString+resultarray[i];//Converting array into Single String
		   if(i<resultarray.length-1)
		   {
			   finalResultString= finalResultString+" ";//adding space after every word except last word
		   }
	   }
	 
	 return  finalResultString;
	 
		
	}
	

}
///OUTPUT::fello hriends aow yre you
