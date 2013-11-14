import static org.junit.Assert.*;

import org.junit.Test;


public class ComandosJuegoTEST {

	ComandosJuego prueba = new ComandosJuego();;
	
	@Test
	public void obtenerpalabra() {
		prueba.seleccionar();
		assertEquals("Pedro", prueba.palabra);
	}
	
	@Test
	public void verificarletraSi() {
		String letra="e";
		prueba.palabra="Pedro";
		assertEquals(true, prueba.verificarletra(letra));
	}

	@Test
	public void verificarletraNo() {
		String letra="s";
		prueba.palabra="Pedro";
		assertEquals(false, prueba.verificarletra(letra));
	}
	
}
