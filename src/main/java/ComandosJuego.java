import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ComandosJuego {
	public String palabra;
	public String adivina;
	public int canterrores;
	
	
	public void seleccionar()
	{
		ArrayList<String> lista = new ArrayList<String>();
		try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("Archivo.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                // Imprimimos la línea por pantalla
                lista.add(strLinea);
            }
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
		palabra = lista.get(0);
		
	}
	
	public boolean verificarletra(String letra)
	{
		return palabra.contains(letra);
	}
	
}
