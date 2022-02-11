
public class Libreria {

}

public class Libreria implements Comparable<Libreria> {
	private String isbn;
	private String titulolibro;
	private double preciolibro;
	private int cantidadlibro;

	public Libreria() {
		
	}
	
	public Libreria(String isbn, String titulolibro, double preciolibro, int cantidadlibro) {
		this.isbn = isbn;
		this.titulolibro = titulolibro;
		this.preciolibro = preciolibro;
		this.cantidadlibro = cantidadlibro;
	}
	
	// getters y setters
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitulo() {
		return titulolibro;
	}
	
	public void setTitulo(String titulolibro) {
		this.titulolibro = titulolibro;
	}
	
	public double getPrecio() {
		return preciolibro;
	}
	
	public void setPrecio(double preciolibro) {
		this.preciolibro = preciolibro;
	}
	
	public int getCantidadLibro() {
		return cantidadlibro;
	}
	
	public void setCantidad(int cantidadlibro) {
		this.cantidadlibro = cantidadlibro;
	}
	
	@Override
	public boolean equals(Object obj) {
		Libreria l = (Libreria)obj;
		return this.isbn.equals(l.isbn);
	}

	@Override
	public String toString() {
		return this.isbn + " - " + this.titulolibro + " - " +"$"+ this.preciolibro + " - " + this.cantidadlibro; 
	}
	
	@Override
	public int compareTo(Libreria l) {
		if(l.getPrecio() < preciolibro) {
			return -1;
		}else {
			return 1;
		}
	}
}
