package pack01;

public class CreaVisualizador {
	
	public static Visualizador creaVisualizador() {
		System.out.println("Introduzca un mobre para este visualizador.");
		System.out.println("Esto ayudara a la hora de identificar de donde viene la info.");
		String n = GestionDeEntradasConsola.entradaString();
		Visualizador v = new Visualizador(n);
		return v;
	}

}
