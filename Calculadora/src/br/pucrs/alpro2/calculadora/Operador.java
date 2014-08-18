package br.pucrs.alpro2.calculadora;

public class Operador {
	
	private double a;
	private double b;
	
	public Operador(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	public double somador(){
		return a+b;
	}
	

}

