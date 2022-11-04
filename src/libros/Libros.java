package libros;

import java.util.ArrayList;

import autores.Autores;

public class Libros {
	//POJO LIBROS
	private String titulo; //1-1
	private double precio; //1-11
	private ArrayList<Autores> ListaAutores; //1-n
	
	
	
	
	public Libros(String titulo, double precio) {
		super();
		this.titulo = titulo;
		this.precio = precio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setListaAutores(ArrayList<Autores> listaAutores) {
		ListaAutores = listaAutores;
	}
	public ArrayList<Autores> getListaAutores() {
		return ListaAutores;
	}
	
}
