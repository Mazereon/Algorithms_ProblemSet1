import java.util.*;
import java.lang.*;
import java.io.*;
/* Stanley Galleta - Problem 1: Recursion in the Math Olympiad*/
public class GalletaP1
{
    static int n,cases;
	static long vis[]=new long[1000000];
	public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        cases = sc.nextInt();
        for(int num = 0; num<cases; num++)
		{
        	n=sc.nextInt();   // n
			vis[0]=sc.nextInt(); // A0
		
			for(int i=1; i<1000000; i++) vis[i]=-1;
				System.out.println(Fib(n));
		}
		
    }
    public static long Fib(int k)
    {
        if(k==0) return vis[0];
		else if(Math.sqrt(Fib(k-1)) % 1 == 0) return vis[k]=(long)(Math.sqrt(Fib(k-1)));
		else if(vis[k]!=-1) return vis[k];
		else return vis[k]=(Fib(k-1)+3);
    }
    
}

