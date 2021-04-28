package pack01;

public class Visualizador implements ControlPlazasParking{
	
	private int plazasMoto;
	private int plazasCoche;
	
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

}
