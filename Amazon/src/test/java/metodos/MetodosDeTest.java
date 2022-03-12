package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MetodosDeTest {

	WebDriver driver;

	/**
	 * Metodo para abrir navegador chrome e firefox
	 * 
	 * @author Marcelo Messias
	 * @param navegador
	 * @param url
	 */

	public void abrirNavegador(String navegador, String url) {

		if (navegador.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (navegador.equalsIgnoreCase("FIREFOX")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.err.println("Navegador indisponivel digite ");
		}

		driver.manage().window().maximize();
		driver.get(url);

	}

	/**
	 * Metodo para preencher um texto desejado
	 * 
	 * @autor Marcelo Messias
	 * @param texto
	 */
	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	/**
	 * Metodo para clicar
	 * 
	 * @autor Marcelo Messias
	 * @param elemnto
	 */
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void fecharNavegador() {
		driver.quit();
		System.out.println("------------------Teste Finalizado--------------------------");
	}
}
