package br.pucrs.alpro2.calculadora;

public class Main {

	public static void main(String[] args) {
		double a = 0, b = 0, result = 0;
		
		Operador op = new Operador(a, b);
		
		result = op.somador();
		
		System.out.print("Resultado: " + result);
		
		
	}

}
