package pack01;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parking fuente = new Parking(100, 100);
		Visualizador vista1 = new Visualizador();
		
		fuente.agregarObservador(vista1);
		
		while(fuente.getMaximoPlazasMoto() < fuente.getMaximoPlazasMoto()) {
			fuente.entradaMoto();
			System.out.println("Plazas de moto en este parking: " + vista1.getPlazasMoto());
		}

	}

}
