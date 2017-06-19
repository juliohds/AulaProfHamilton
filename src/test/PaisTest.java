package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import model.Pais;
import service.PaisService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTest {
	Pais pais, copia;
	PaisService paisService;
	static int id = 0;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		pais = new Pais();
		pais.setId(id);
		pais.setNome("PaisTeste");	
		pais.setPopulacao(15);
		pais.setArea(15);
		
		copia = new Pais();
		copia.setId(id);
		copia.setNome("PaisTeste");	
		copia.setPopulacao(15);
		copia.setArea(15);
		
		paisService = new PaisService();
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}
	
	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		//para funcionar o cliente 5 deve ter sido carregado no banco por fora
		Pais fixture = new Pais();
		fixture.setId(5);
		fixture.setNome("Paiszao");
		fixture.setPopulacao(1.0);
		fixture.setArea(154.0);
		PaisService novoService = new PaisService();
		Pais novo = novoService.carregar(5);
		assertEquals("testa inclusao", novo, fixture);
	}
		
	@Test
	public void testCriar() {
		System.out.println("criar");
		id = paisService.criar(pais);
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", pais, copia);
	}
	

	@Test
	public void testExcluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao(0);
		copia.setArea(0);
		
		paisService.excluir(pais);
		
		pais = paisService.carregar(id);
		assertEquals("testa exclusao", pais, copia);
	}
	@Test
	public void testMenor() {
		System.out.println("menor");
		//para funcionar o cliente 1 deve ter sido carregado no banco por fora
		Pais fixture = new Pais();
		fixture.setId(2);
		fixture.setNome("India");
		fixture.setPopulacao(1278160);
		fixture.setArea(7517.00);
		PaisService novoService = new PaisService();
		Pais novo = novoService.paisComMenorArea();
		assertEquals("testa menor",fixture,novo);
	}
	@Test
	public void testMaior() {
		System.out.println("Maior");
		//para funcionar o cliente 1 deve ter sido carregado no banco por fora
		Pais fixture = new Pais();
		fixture.setId(1);
		fixture.setNome("China");
		fixture.setPopulacao(1372470);
		fixture.setArea(96000000.00);
		PaisService novoService = new PaisService();
		Pais novo = novoService.paisMaiorNumeroHabitante();
		assertEquals("testa maior",fixture,novo);
	}
	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		pais.setNome("999999");
		copia.setNome("999999");		
		paisService.atualizar(pais);
		pais = paisService.carregar(pais.getId());
		assertEquals("testa atualizacao", pais, copia);
	}

}
