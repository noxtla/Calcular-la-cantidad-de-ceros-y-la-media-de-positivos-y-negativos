package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	int numero,resultado,positivos = 0,negativos = 0,ceros=0,Npositivos=0,Nnegativos=0;
	
	
	JOptionPane.showMessageDialog(null, "Ingresa 10 numeros");
	for (int i =1; i<=10; i++) {
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero " +i));
		
		
		if (numero > 0) {
			 positivos += numero;
			 Npositivos++;
		}
		if (numero < 0) {
			 negativos += numero;
			 Nnegativos++;
		}
		if (numero == 0) {
			ceros ++;
		}
		
	 }
	
	JOptionPane.showMessageDialog(null, "La media de positivos" + (positivos/Npositivos));
	JOptionPane.showMessageDialog(null, "La media de negativos" + (negativos/Nnegativos));
	JOptionPane.showMessageDialog(null, "La cantida de ceros" + ceros);
	}
}

