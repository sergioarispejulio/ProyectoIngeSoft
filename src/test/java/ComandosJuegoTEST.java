import static org.junit.Assert.*;

import org.junit.Test;


public class ComandosJuegoTEST {

	ComandosJuego prueba = new ComandosJuego();
	
	@Test
	public void obtenerpalabra() {
		prueba.palabra="Pedro";
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
	
	@Test
	public void obtenerpalabradiccionario() {
		prueba.obtenerpalabras();
		assertEquals(false, prueba.lista.isEmpty());
	}
	
	@Test
	public void agregarpalabra() {
		prueba.obtenerpalabras();
		int cant = prueba.lista.size() ;
		prueba.agregarpalabra("hola");
		prueba.obtenerpalabras();
		assertEquals(cant+1, prueba.lista.size());
	}
	
	@Test
	public void seleccionnivel() {
		prueba.seleccionarnivel(2);
		assertEquals(4, prueba.canterrores);
	}
	
}
