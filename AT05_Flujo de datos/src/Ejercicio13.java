import java.util.Scanner;
public class Ejercicio13 {
public static void main (String[]args) {
	System.out.println("Introduce el primer operando");
	Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
	System.out.println("Introduce el segundo operando");
    int number2 = sc.nextInt();
	System.out.println("Introduce el signo aritmetico ");
    String art = sc.nextLine();
    int res;
  switch (art) {
  case "+":
	   res = number + number2;
		System.out.println("El resultado del calculo es: "+res);
	   break;
  case "-":
	   res = number - number2;
		System.out.println("El resultado del calculo es: "+res);
	   break;
  case "*":
	  res  = number * number2;
		System.out.println("El resultado del calculo es: "+res);
	  break;
  case "/":
	  res = number / number2;
		System.out.println("El resultado del calculo es: "+res);
	  break;
  case "^":
	  res = number ^ number2;
		System.out.println("El resultado del calculo es: "+res);
	  break;
  case "%":
	  res = number % number2;
		System.out.println("El resultado del calculo es: "+res);
	  break;
  }  

}
}
