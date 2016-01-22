public class modExp{
	/*function modexp(x, y, N)
	Input: Two n-bit integers x and N, an integer exponent y Output: xy mod N
	if y=0: 
		return 1 
	z = modexp(x, ⌊y/2⌋, N ) 
	if y is even:
		return z^2 mod N 
	else:
		return x · z^2 mod N*/

	public static long modexp(int x, int y, int n){
		if(y==0)
			return 1;
		long z= modexp(x, y/2, n);
		if((y%2)==0)
			return ((z*z)%n);
		else
			return (x*(z*z)%n);
	}

	public static void main(String[] args){
		int x=17;
		int y=5;
		int n=10;
		System.out.println(modexp(x,y,n));

	}
}//end of class