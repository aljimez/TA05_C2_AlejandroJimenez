import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[]args) {
		int c =0;
		//Ejercicio10
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero de ventas");
		int nventas = sc.nextInt();
	String arrventas[];
	arrventas = new String[nventas];
		for(int i =0; i <= arrventas.length; i++ ) {
			System.out.println("Introduce ventas");
			String cventas = sc.nextLine();
			arrventas[i] = cventas;
			if (arrventas[i] != null) {
				c++;
			}
		}
	}
}
