package pack01;

public class CrearUnParking {
	
	public static Parking nuevoParking() {
		System.out.println("Introduzca el nombre del parking: ");
		String nombre = GestionDeEntradasConsola.entradaString();
		
		System.out.println("Introduzca el numero de plazas de moto de que dispone: ");
		int plazasMoto = GestionDeEntradasConsola.entradaNumeroEnteroPositivo();
		
		System.out.println("Introduzca el numero de plazas de coche de que dispone: ");
		int plazasCoche = GestionDeEntradasConsola.entradaNumeroEnteroPositivo();
		
		Parking parking = new Parking(plazasMoto, plazasCoche, nombre);
		return parking;
	}

}
