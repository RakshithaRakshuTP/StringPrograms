package com.Section3Programming.pack;
//find the number of possible permutation of characters for the given String
public class PermutionOfOccurenceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbac";
		char []s1=s.toCharArray();
		int length=s.length();
		int nfact=1;
		int nupermu=0;
		while(length>0)
		{
			nfact=nfact*length;
			length--;
		}
		int []f=new int[s.length()];
		for(int i=0;i<s.length();i++)
		{	f[i]=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s1[i]==s1[j]&&s1[i]!='@')
				{
					s1[j]='@';
					f[i]++;
					
				}
			}
		}
		int dfact=1;
		for(int i=0;i<f.length;i++)
		{
			if(f[i]>=2)
			{
				int fact=1;
				while(f[i]>0)
				{
					fact=fact*f[i];
					f[i]=f[i]-1;
				}
				dfact=dfact*fact;
			}
		}
		
		nupermu=nfact/dfact;
		System.out.println("The number of ways to arrange the String::"+s+" is= "+nupermu);
		

	}

}
//OUTPUT::The number of ways to arrange the String::abbac is= 30
