package learn1; 	// Aturcara penambahan dua nombor

public class Main {
	
	static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		System.out.println("Enter First Number: ");
		num1 = scanner.nextInt();
		
		System.out.println("Enter second Number: ");
		num2 = scanner.nextInt();
		
		int answer = TambahNombor(num1,num2);
		System.out.println("The answer is " + answer);

	}
	
	public static int TambahNombor(int a, int b) {
		int jawapan = a + b;
		return jawapan;
	}

}
