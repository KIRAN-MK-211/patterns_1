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
	    int i,j,k,p=1;
	    for(i=65;i<=69;i++)
	    {
	        for(k=1;k<=p;k++)
	        System.out.print(" ");
	        for(j=69;j>=i;j--)
	        System.out.print((char)j);
	        
	        
	        System.out.println();
	        p++;
	    }
	}
}
