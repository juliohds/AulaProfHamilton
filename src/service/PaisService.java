package service;

import dao.PaisDao;
import model.Pais;

public class PaisService {

	private PaisDao dao;
	
	public PaisService() {
		this.dao = new PaisDao();
	}

	public void criar(Pais pais){
		dao.criar(pais);
	}
	
	public Pais carregar(int id){
		return dao.carregar(id);
	}
	
	public void atualizar(Pais pais){
		dao.atualizar(pais);
	}
	
	public void excluir(Pais pais){
		dao.excluir(pais);
	}
	
	public Pais paisComMenorArea(){
		return dao.paisComMenorArea();
	}
	
	public Pais paisMaiorNumeroHabitante(){
		return dao.paisMaiorNumeroHabitante();
	}
	
	public Pais[] vetor3(){
		return dao.retornaUmVetor3();
	}
	
	
	
	
	
}
