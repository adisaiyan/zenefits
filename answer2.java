/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class answer2
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String a[]=new String[26];
	    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("enter the no");
	    String v=buf.readLine();
	    int n=Integer.parseInt(v);
	    for(int i=0;i<n;i++)
	    {
	       String x =buf.readLine();
	       a[i]=x;
	    }
		// your code goes here
	}
}
