package amazon;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementosweb.Elementos;
import metodos.MetodosDeTest;

public class PesquisarProduto {

	MetodosDeTest metodos = new MetodosDeTest();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador("chrome", "https://amazon.com.br");

	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharNavegador();
	}

	@Test
	public void testPesquisarProduto() {
		metodos.preencher(el.pesquisar, "notebook");
		metodos.clicar(el.lupaPesquisa);

	}

}
