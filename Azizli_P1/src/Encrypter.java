import java.util.Scanner; 

public class Encrypter {

	static int necessaryEncrypter;
	static int Number1;
	static int Number2;
	static int Number3;
	static int Number4;
	
	public static void Encrypter() {
		Scanner Decimals = new Scanner(System.in);
	
	 System.out.println("You can write the number to Encrypt: ");
	 
	 necessaryEncrypter = Decimals.nextInt();
	 
	 Number1 = (Number1 +7) % 10;
	 Number2 = (Number2 +7) % 10;
	 Number3 = (Number3 +7) % 10;
	 Number4 = (Number4 +7) % 10;
	
	 
	
	}
	
	
	


}
