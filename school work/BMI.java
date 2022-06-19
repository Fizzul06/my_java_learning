
public class BMI {
static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		
		String syarat;
		String status = null;
		String nama;
		
		System.out.println();
		System.out.print("Masukkan nama:");
		nama = input.next();
		
		//masukan berat badan
		System.out.print("Masukkan berat badan (dalam KG):");
		double berat = input.nextDouble();
		
		//massukan tinggi
		System.out.print("masukkan tinggi (dalam meter):");
		double tinggi = input.nextDouble();
		
		//kira BMI yang betul
		double tinggi2 = tinggi * tinggi;
		double BMI = berat / tinggi2;
		
		//kira BMI yang asal salah
		//double BMI = berat / tinggi * tinggi;
		
		//papar
		System.out.print("BMI anda ialah: "+BMI);
		System.out.println();
		
		//tentukan status BMI
		if (BMI > 45.3) {
			status = "Bahaya";
		}else if (BMI >= 31.0 && BMI <= 45.3) {
			status = "Obesiti";
		}else if (BMI >= 26.3 && BMI <= 30.9) {
			status = "Gemuk";
		}else if (BMI >= 20.7 && BMI <= 26.4) {
			status = "normal";
		}else if (BMI < 20.6) {
			status = "Kurus";
		}
		
		//nyatakan status
		System.out.print("status anda ialah: "+status);
		System.out.println();
		
		

	}

}
