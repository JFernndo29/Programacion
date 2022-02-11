import java.util.*;

public class MainLibro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int op = -1;
		int cantidadlibro;
		double preciolibro;
		String titulolibro, isbn;
		
		InventarioLibro InventarioLibro = new InventarioLibro();
		ArrayList<Libreria> libros = InventarioLibro.getLibros(); 
		
		while(op!=0) {
			System.out.println("            MENÚ");
			System.out.println("1.- Registrar libros");
			System.out.println("2.- Buscar libro por ISBN");
			System.out.println("3.- Venta de libros");
			System.out.println("4.- Mostrar todos los libros");
			System.out.println("5.- Mostrar top tres libros más caros");
			System.out.println("0.- Salir");
			System.out.println("Elija la opción:");
			op = sc.nextInt();
			System.out.println();
			
			switch(op) {
				case 0:
					System.out.println("Gracias");
					break;
				case 1:
					System.out.println("REGISTRO DE LIBROS.-");
					for(int i=0;i<6;i++) {
						System.out.println("Registro #"+(i+1));
						System.out.println("ISBN: ");
						isbn = sc.next();
						Libreria result = InventarioLibro.getLibrobyIsbn(isbn);
						if(result != null) {
							System.out.println("ISBN "+isbn+" YA EXISTE");
						}else {
							System.out.println("Título del libro: ");
							titulolibro = sc.next();
							System.out.println("Precio del libro: ");
							preciolibro = sc.nextInt();
							System.out.println("¿Cuántos libros hay?: ");
							cantidadlibro = sc.nextInt(); 
							Libreria ln = new Libreria(isbn, titulolibro, preciolibro, cantidadlibro);
							InventarioLibro.almacenar(ln);
						}
						System.out.println();
					}
					System.out.println();
					break;
				case 2:
					System.out.println("BÚSQUEDA POR ISBN.-");
					System.out.println("Introduzca ISBN para buscar: ");
					isbn = sc.next();
					System.out.println();
					Libreria result = InventarioLibro.getLibrobyIsbn(isbn);
					if(result != null) {
						System.out.println("ISBN pertenece a.-");
						System.out.println(result);
					}else {
						System.out.println("No se encontro el libro "+ isbn);
					}
					System.out.println();
					break;
				case 3:
					System.out.println("VENTA DE LIBROS:");
					System.out.println();
					System.out.println("Libros disponibles son:");
					InventarioLibro.verLibreria();
					System.out.println();
					System.out.println("Ingrese ISBN del libro que desee comprar:");
					isbn = sc.next();
					Libreria resul = InventarioLibro.getLibrobyIsbn(isbn);
					if(resul != null) {
						System.out.println("¿Cuantós libro desea comprar?");
						cantidadlibro = sc.nextInt();
						InventarioLibro.ventaLibro(resul, cantidadlibro);
					}else {
						System.out.println("No se encontro el libro con el ISBN "+ isbn);
					}
					System.out.println();
					break;
				case 4:
					InventarioLibro.verLibreria();
					System.out.println();
					break;
				case 5:
					System.out.println("TOP 3 DE LOS LIBROS MÁS CAROS.-");
					Collections.sort(libros);
					for (int i=0; i <3;i++ ) { 
						System.out.println(libros.get(i)); 
					}
					System.out.println();
					break;
			}
		}
		sc.close();	
	}
}
