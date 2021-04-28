package pack01;

public class Visualizador implements ControlPlazasParking{
	
	private int plazasMoto;
	private int plazasCoche;
	private int plazasMaxMoto;
	private int plazasMaxCoche;
	private String nombre;
	private String nombreVisualizador;
	
	public Visualizador(String nombreVisualizador) {
		this.nombreVisualizador = nombreVisualizador;
	}
	
	@Override
	public void fuenteIncrementada(ValorCambioEvento evento) {
		plazasMoto = evento.getSource().getPlazasMoto();
		plazasCoche = evento.getSource().getPlazasCoche();
		plazasMaxMoto = evento.getSource().getMaximoPlazasMoto();
		plazasMaxCoche = evento.getSource().getMaximoPlazasCoche();
		nombre = evento.getSource().getNombre();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getNombreVisualizador() {
		return nombreVisualizador;
	}
	
	public int getPlazasMoto() {
		return plazasMoto;
	}
	public int getPlazasCoche() {
		return plazasCoche;
	}
	
	public int getMaximoDePlazasMoto() {
		return plazasMaxMoto;
	}
	public int getMaximoDePlazasCoche() {
		return plazasMaxCoche;
	}
	
	@Override
	public String toString() {
		return (plazasMoto + " plazas de moto." + plazasCoche + "plazas de coche.");
	}

}
