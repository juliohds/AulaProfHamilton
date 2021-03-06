package model;

public class Pais {

	int id;	
	String nome;
	double populacao;
	double area;
	
	public Pais(){
		
	}
	
	public Pais(int id, String nome, long populacao, double area){
		
		this.id = id;
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
					
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPopulacao() {
		return populacao;
	}

	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", populacao=" + populacao + ", area=" + area + "]";
	}

	
}
