/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) 
	{
		int i,j,k,p=1,l=65;
		for(i=65;i<=69;i++)
		{
		   for(j=5;j>=p;j--)
		   {
		       System.out.print((char)j + " ");
		   }
		   if(i!=65)
		   {
                for(k=65;k<=l;k++)
                    System.out.print((char)k +" ");
                    l++;
		   }
		   p++;
		   System.out.println();
		   
    		   
		   
		}
	}
}
