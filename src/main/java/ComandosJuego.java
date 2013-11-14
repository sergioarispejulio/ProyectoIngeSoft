import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;


public class ComandosJuego {
	public String palabra;
	public String adivina;
	public int canterrores;//fácil son 6 errores, normal son 4, difícil son 2 errores
	ArrayList<String> lista;
	public int errores;
	public int nivel; //1 es fácil;2 es normal; 3 es difícil
	
	public ComandosJuego() //constructor
	{
		lista = new ArrayList<String>();
	}
	
	public boolean verificarletra(String letra)//verifica si la letra esta en la palabra
	{
		return palabra.contains(letra) ;
	}
	
	public void obtenerpalabras()//cargar palabras del diccionario
	{
		lista.clear();
		try{
			String linea = "";
			FileReader leerArchivo = new FileReader("Archivo.txt");
			BufferedReader buffer = new BufferedReader(leerArchivo);
			while ((linea = buffer.readLine()) != null){
			    lista.add(linea);
			}
			buffer.close();
        }catch (Exception e){ 
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
	}
	
	public void agregarpalabra(String palabra)//agregar palabras al diccionario
	{
		lista.add(palabra);
		try{
			File f = new File("Archivo.txt");
			FileWriter w = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(w);
			for(int i = 0; i < lista.size(); i++)
			{
				bw.write(lista.get(i)); 
				bw.newLine();
			}
			bw.close();
		}
		catch(IOException e){};
	}
	
	public void seleccionarnivel(int ni)//Pone la cantidad de errores de acuerdo al nivel
	{
		switch(ni)
		{
		case 1:
			canterrores = 6;
			nivel = ni;
			break;
		case 2:
			canterrores = 4;
			nivel = ni;
			break;
		case 3:
			canterrores = 2;
			nivel = ni;
			break;
		}
	}
	
}
