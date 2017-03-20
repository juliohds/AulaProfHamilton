package model;

import javax.swing.JOptionPane;

import service.PaisService;

public class MainPais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaisService novo = new PaisService();
		
		Pais p = new Pais(1, "Brasil", 310000000, 610000000);
		Pais pTeste = new Pais(5, "TESTE", 999999, 999999);
		
		JOptionPane.showMessageDialog(null, "SELECT "+ novo.carregar(1));
		
		novo.atualizar(p);
		JOptionPane.showMessageDialog(null, "Atualizado "+ novo.carregar(1));
		
		JOptionPane.showMessageDialog(null, "Pais Com Menor Area"+novo.paisComMenorArea());		
		JOptionPane.showMessageDialog(null, "Pais Maior Numero Habitante"+ novo.paisMaiorNumeroHabitante());
		
		novo.criar(pTeste);
		JOptionPane.showMessageDialog(null, "Criado "+ novo.carregar(5));
		novo.excluir(pTeste);
		JOptionPane.showMessageDialog(null, "Excluido "+ novo.carregar(5));
						
		for (Pais pFor: novo.vetor3()) {
			
			JOptionPane.showMessageDialog(null, "retornando um vetor de 3 Pais "+ pFor.toString());
		}
		
		
		
	}

}
