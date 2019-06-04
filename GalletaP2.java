import java.util.*;
import java.lang.*;
import java.io.*;
/* Stanley Galleta - Problem 2: Cell Multiplication*/
public class GalletaP2
{
	public static void main (String[] args) throws java.lang.Exception
    {
    	Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		if(cases < 0 || cases > 100) System.exit(0);
		for(int num = 0; num<cases; num++)
		{
			int t = sc.nextInt();
			long w = sc.nextInt();
			long r = sc.nextInt();
			long s = sc.nextInt();

			if(t < 0 || t > 1000000000 || w < 0 || w > 1000000000 || r < 0 || r > 1000000000 || s < 0 || s > 1000000000) System.exit(0);
			for(int j = 0; j < t; j++)
			{
				long W = (w + s) % 100;
				long R = (r + (2 * w) + (2 * s)) % 100;
				long S = ((3 * s) + (3 * r) + (3 * w)) % 100;

				w = W;
				r = R;
				s = S;
			}
			System.out.println(w + " " + r + " " + s);
		}
	}
}
