package libros;

public class ImprimirDatosLibros {

	public  static  void  imprimirLibro(Libros  libro)  {
		System.out.println("Título  del  libro..."+libro.getTitulo());
		System.out.println("Precio  del  libro..."+libro.getPrecio());
		for  (int  i  =  0;  i  <  libro.getListaAutores().size();  i++)
		{ System.out.println("El  nombre  del  autor  es:  "+  libro.getListaAutores().get(i).getNombreAutor( )  
			+  "  y  su  licencia  fiscal  es:  "  +  libro.getListaAutores().get(i).getLicenciaFiscal()); 
		} 
	} 
}
