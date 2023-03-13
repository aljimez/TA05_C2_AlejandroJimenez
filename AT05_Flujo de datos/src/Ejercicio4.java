import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[]args){
		//Ejercicio4
		String radio = JOptionPane.showInputDialog("Introduce aqui el radio");
		double R = Double.parseDouble(radio);
		double result = Math.PI * Math.pow(R,2);
	}
}
