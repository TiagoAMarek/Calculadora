package br.pucrs.alpro2.calculadora;

public class Operador {
	
	private String operacacao;
	private Double a;
	private Double b;
	
	public Operador() {
		super();
		this.operacacao = "";
		this.a = null;
		this.b = null;
	}

	public String getOperacacao() {
		return operacacao;
	}

	public void setOperacacao(String operacacao) {
		this.operacacao = operacacao;
	}

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}
	
	public Double somador(){
		return a+b;
	}
	

}

