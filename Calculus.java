class Calculus
{

int a;
int b;
public Calculus (int c, int d)
{
	a=c;
	b=d;
}
public int addition(){
	System.out.println("Sum is:"+(a+b));
	int c = a+b;
         return c;
}
public int multiplication(){

         System.out.println("Mul is:"+(a*b));
         int c= a*b;
         return c;

}


   
public static void main(String[]args)
	{
		Calculus c=new Calculus(450, 500);
		c.addition();
                c. multiplication();


		 
	}
}