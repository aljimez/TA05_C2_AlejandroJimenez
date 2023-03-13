import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[]args) {
		//Ejercicio6
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el precio del producto");
		double number = sc.nextDouble();
		int IVA = 21; 
		double  resultadoiva = number  * (IVA/100);
		double resultado = number + resultadoiva;	
	}
}
