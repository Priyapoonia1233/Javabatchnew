package javapackage;

import javapackage.Assignmentnew1;

public class Assignmentnew1 {
	public int sum(int a1, int b1) {
		int c1;
		c1=a1+b1;
		System.out.println("Sum result is "+c1);
		return c1;
	}
	public int sub(int a2, int b2) {
		int c2;
		c2=a2-b2;
		System.out.println("Subtraction result is "+c2);
		return c2;
	}
	public int mul(int a3, int b3) {
		int c3;
		c3=a3*b3;
		System.out.println("Multiplication result is "+c3);
		return c3;
	}
	public int div(int a4, int b4) {
		int c4;
		c4=a4/b4;
		System.out.println("Final result is "+c4);
		return c4;
	}
	public static void main(String args[]) {
		Assignmentnew1 obj1 = new Assignmentnew1();
		int sum1 = obj1.sum(10, 2);
		int sum2 = obj1.sum(sum1,2);
		int sub1 = obj1.sub(sum2, 2);
		int mul1 = obj1.mul(sub1, 2);
		obj1.div(mul1, 2);

}

	}


/* ((((10+2)+2)-2)*2)/2)
sum,subtract,multi,div
here we will call the sum method two times from the main method
main method
int sumresult=refernce_variable.sum(10,2);
int sumresult2=refernce_variable.sum(sumresult,2);
int subresult=reference_variable.sub(sumresult2,2);
reference_variable.multiplication(subresult,2);
   */

