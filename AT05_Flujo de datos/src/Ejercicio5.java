import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[]args){
		//Ejercicio5
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 2 == 0) {
        	System.out.println("El numero introducido es divisible entre 2");
        }else if(number % 2 !=0 ) {
        	System.out.println("El numero introducido no es divisible entre 2");
        }
	}
}
