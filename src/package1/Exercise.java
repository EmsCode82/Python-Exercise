package package1;

public class Exercise {

	public static void main(String[] args) {
		//(a+b)square = ((a*a) + 2ab + (b*b))
		int a = 25;
		float b = 42.159f;
		int value = (int)(a*a + 2*(a*b) + b*b);
		System.out.println("Value of the equation is "+ value);
		
	}

}
