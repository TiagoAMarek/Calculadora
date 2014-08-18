package br.pucrs.alpro2.calculadora;

import javax.swing.JFrame;

public class Escolhe {
	  private JFrame tela;
	
	public void montaTela(){
		preparaTela();
		preparaPainelPrincipal();
		preparaBotoes();
		mostraJanela();
	}
	
	private void mostraJanela() {
		  tela.pack();
		  tela.setSize(540, 540);
		  tela.setVisible(true);		
	}


	private void preparaBotoes() {
		// TODO Criação dos botões.
		
	}

	private void preparaPainelPrincipal() {
		// TODO Ajustar painel principal.
		
	}

	public void preparaTela(){		
	   
		tela = new JFrame("Calculadora");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
