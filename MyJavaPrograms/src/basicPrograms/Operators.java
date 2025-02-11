package basicPrograms;

public class Operators {

	public static void main(String[] args) {
		// Arithmetic Operators

		float a = 10;
		float b = 20;

		System.out.println(a + b);
		System.out.println(b - a);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		// Relational Operators

		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b);

		// Logical Operators

		boolean x = true, y = false;

		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);

		// Assignment Operators
		float c;
		c = a;
		System.out.println(c);
		c = b;
		System.out.println(c);
		c = 50;
		c += 5; // c=c+5;
		System.out.println(c);

		System.out.println(c -= 5); // c=c-5;
		System.out.println(c *= 5); // c=c*5;
		System.out.println(c /= 5); // c=c/5

		// Increment Operators
		c++; // c=c=1;

		System.out.println(c);
		c = 100;
		c--; // c=c-1;
		System.out.println(c);

	}

}
