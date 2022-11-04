package autores;

public class Autores {
	//Propiedades de la clase
	private String nombreAutor; //1-1
	private int licenciaFiscal; //1-1

	public Autores() {};
	
	public Autores(String nombreAutor, int licenciaFiscal) {
		super();
		this.nombreAutor = nombreAutor;
		this.licenciaFiscal = licenciaFiscal;
	}
	
	//metodos
	public String getNombreAutor() {
		return nombreAutor;
	}
	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	public int getLicenciaFiscal() {
		return licenciaFiscal;
	}
	public void setLicenciaFiscal(int licenciaFiscal) {
		this.licenciaFiscal = licenciaFiscal;
	}
	
	
}
