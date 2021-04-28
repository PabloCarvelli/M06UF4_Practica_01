package pack01;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parking fuente1 = CrearUnParking.nuevoParking(); // pide los datos y crea un primer parking.
		Parking fuente2 = CrearUnParking.nuevoParking(); // pide los datos y crea un segundo parking.
		
		Visualizador vista1 = CreaVisualizador.creaVisualizador(); // crea un nuevo visualizador que es observador del parking 1.
		Visualizador vista2 = CreaVisualizador.creaVisualizador(); // crea un nuevo visualizador que es observador del parking 2.
		
		fuente1.agregarObservador(vista1); // indicamos a la fuente Parking de que vista1 sera uno de sus observadores.
		fuente1.agregarObservador(vista2); // indicamos a la fuente Parking de que vista 2, tambien sera su observador.
		
		fuente2.agregarObservador(vista1);
		fuente2.agregarObservador(vista2);
		
		while(fuente1.getPlazasMoto() < fuente1.getMaximoPlazasMoto() || fuente1.getPlazasCoche() < fuente1.getMaximoPlazasCoche()) {
			fuente1.entradaMoto();
			fuente1.entradaCoche();
			
			fuente2.entradaMoto();
			fuente2.entradaCoche();
			
			System.out.println("Del visualizador: " + vista1.getNombreVisualizador());
			
			System.out.println("Del parking: " + vista1.getNombre() + ".");
			
			System.out.println("De un total de: " + vista1.getMaximoDePlazasMoto() + " de plazas de moto.");
			System.out.println("Se encuentran ocupadas: " + vista1.getPlazasMoto());
			System.out.println("De un total de: " + vista1.getMaximoDePlazasCoche() + " de plazas de coche.");
			System.out.println("Se encuentran ocupadas: " + vista1.getPlazasCoche());
			System.out.println();
			
			System.out.println("Del visualizador: " + vista2.getNombreVisualizador());
			
			System.out.println("Del parking: " + vista2.getNombre() + ".");
			
			System.out.println("De un total de: " + vista2.getMaximoDePlazasMoto() + " de plazas de moto.");
			System.out.println("Se encuentran ocupadas: " + vista2.getPlazasMoto());
			System.out.println("De un total de: " + vista2.getMaximoDePlazasCoche() + " de plazas de coche.");
			System.out.println("Se encuentran ocupadas: " + vista2.getPlazasCoche());
			System.out.println();
		}

	}

}
