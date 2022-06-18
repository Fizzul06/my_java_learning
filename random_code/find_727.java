
public class find_727 {

	static boolean not;
	static int numcounter;
	static double numX;
	
	public static void main(String[] args) {
		numcounter = 1;
		not = true;
		
		double numxp2;
		double answer;
		double answer2;
		
		int num1 = 1;
		
		numX = 1;
		
		while (not){
			System.out.println("Kalau X sama dengan " + numX);
			
			numxp2 = numX * numX;
			
			answer = num1 / numxp2;
			
			answer2 = numxp2 + answer;
			
			System.out.println(answer2);
			
			not_changer(answer2);
		}

	}
	
	static void not_changer(double y) {
		if (y == 727) {
			System.out.println(y + "!!!!!");
			not = false;
		}
		if (y >= 1000) {
			System.out.println("Fail");
			not = false;
		}
		numX++;
		numcounter++;
		//else
			//System.out.println("not 727");
			
	
	}
}
