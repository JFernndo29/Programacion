import java.util.ArrayList;
public class InventarioLibro {

	private ArrayList<Libreria> libros = new ArrayList<Libreria>();
	
	public void almacenar(Libreria libro) {
		libros.add(libro);
	}
	
	public Libreria getLibrobyIsbn(String isbn) {
		for(Libreria l: libros) {
			if(l.getIsbn().equals(isbn)) {
				return l;
			}
		}
		return null;
	}
	
	public void verLibreria() {
		for(Libreria lb: libros) {
			System.out.println(lb);
		}
	}

	public ArrayList<Libreria> getLibros() {
		return libros;
	}
	
	public void ventaLibro(Libreria libro, int cantidadlibro) {
		if(libro.getCantidadLibro()<cantidadlibro) {
			System.out.println("No hay stock");
		}else if(libro.getCantidadLibro()>=cantidadlibro) {
			libro.setCantidad(libro.getCantidadLibro()-cantidadlibro);
		}
	}
}
