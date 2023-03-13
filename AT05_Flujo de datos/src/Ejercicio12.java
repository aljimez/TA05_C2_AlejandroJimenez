import javax.swing.JOptionPane;

public class Ejercicio12 {
public static void main(String[]args) {
	
	  String passin = JOptionPane.showInputDialog("Introduce aqui la contraseña");

	String pass = "ConTraSSCon";
	int i = 0;
		
		if (passin != pass && i <3) {
			
			System.out.println("La contraseña no es valida");
			i++;

		}
		else if (passin == pass && i <3){
			System.out.println("La contraseña es valida, Enhorabuena "); 
			
		}
		
		
	

}
}
