importar  java.util.ArrayList ;
public  class  InventarioLibro {

	private  ArrayList< Libreria > libros =  new  ArrayList< Libreria > ();
	
	public  void  almacenes ( Libreria  libro ) {
		libros _ add(libro);
	}
	
	 Librería  pública getLibrobyIsbn ( String  isbn ) {
		for ( Librería l : libros) {
			if (l . getIsbn() . equals(isbn)) {
				devolver l;
			}
		}
		devolver  nulo ;
	}
	
	public  void  verLibreria () {
		for ( Librería lb : libros) {
			sistema _ fuera _ imprimir(lb);
		}
	}

	
	public  ArrayList< Libreria >  getLibros () {
		devolver libros;
	}
	
	public  void  ventaLibro ( Libreria  libro , int  cantidadlibro ) {
		if (libro . getCantidadLibro() < cantidadlibro) {
			sistema _ fuera _ println( " No hay existencias de heno " );
		} else  if (libro . getCantidadLibro() >= cantidadlibro) {
			libro _ setCantidad(libro . getCantidadLibro() - cantidadlibro);
		}
	}
}
