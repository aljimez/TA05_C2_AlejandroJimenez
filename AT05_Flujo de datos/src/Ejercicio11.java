import javax.swing.JOptionPane;

public class Ejercicio11 {
public static void main(String []args){
	String dia = "";
	 dia = JOptionPane.showInputDialog("Introduce aqui el dia de la semana");
	
	switch(dia) {
	case "lunes":
		System.out.println("Dia laborable");
	break;
	case "martes":
		System.out.println("Dia laborable");
break;
	case "miercoles":
		System.out.println("Dia laborable");
break;
	case "jueves":
		System.out.println("Dia laborable");
break;
	case "viernes":
		System.out.println("Dia laborable");
break;
	case "sabado":
		System.out.println("Dia laborable");
break;
	case "domingo":
		System.out.println("Dia laborable");
break;
default:
	System.out.println("Dato introducido no valido");

	}}
}
