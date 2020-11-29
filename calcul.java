class calcul
{
	public static void main(String[] args)
	{
		int a,b,c,d,e,f;
		a= Integer.parseInt(args[0]);
		b= Integer.parseInt(args[1]);
		c=a+b;
		d=a*b;
		e=a/b;
		f=a-b;
		System.out.println("Addition="+c+"\nMulti="+d+"\nDiv"+e+"\nSubstraction"+f);
	}
}