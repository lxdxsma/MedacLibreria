package main;

import java.util.ArrayList;

import autores.Autores;
import libros.Libros;

public class Main {

	public static void main(String[] args) {
		
		Autores autor1 = new Autores("Perez de Reverte",1111);
		Autores autor2 = new Autores("Cervantes",2222);
		Autores autor3 = new Autores("Góngora",3333);
		ArrayList<Autores> listaAutores = new ArrayList<>();
		listaAutores.add(autor1);
		listaAutores.add(autor2);
		listaAutores.add(autor3);
		
		System.out.println("Imprimiendo la lista");
		for (Autores autores : listaAutores) {
			//Es un foreach que cambia la estructura, por eso no hay contador
			
			System.out.println("Nombre autor..." + autores.getNombreAutor());
			System.out.println("Licencia autor..." + autores.getLicenciaFiscal());
		}
		Libros libro1 = new Libros("Desconocido", 22);
		libro1.setListaAutores(listaAutores);
		System.out.println("Imprimiendo el libro...");
		System.out.println("Titulo... " + libro1.getTitulo());
		System.out.println("Precio... " + libro1.getPrecio());
		ArrayList<Autores> listaAutoresLibro1 = new ArrayList<>();
		listaAutoresLibro1 = libro1.getListaAutores();
		for (Autores autores : listaAutoresLibro1) {
			
			System.out.println("Nombre autor..." + autores.getNombreAutor());
			System.out.println("Licencia autor..." + autores.getLicenciaFiscal());
		}
	}
}
