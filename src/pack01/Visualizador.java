package pack01;

public class Visualizador implements ControlPlazasParking{
	
	private int plazasMoto;
	private int plazasCoche;
	
	@Override
	public void fuenteIncrementada(ValorCambioEvento evento) {
		plazasMoto = evento.getSource().getPlazasMoto();
		plazasCoche = evento.getSource().getPlazasCoche();
	}
	
	public int getPlazasMoto() {
		return plazasMoto;
	}
	public int getPlazasCoche() {
		return plazasCoche;
	}
	
	@Override
	public String toString() {
		return (plazasMoto + " plazas de moto." + plazasCoche + "plazas de coche.");
	}

}
