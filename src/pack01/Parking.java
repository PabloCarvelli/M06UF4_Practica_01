package pack01;

import java.util.*;

public class Parking {
	
	private ArrayList<ControlPlazasParking> listeners = new ArrayList();
	
	private String nombre;
	
	private int maximoPlazasMoto;
	private int maximoPlazasCoche;
	
	private int plazasMoto = 0;
	private int plazasCoche = 0;
	
	public Parking() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Parking(int motos, int coches, String nombre) {
		
		this.nombre = nombre;
		this.maximoPlazasMoto = motos;
		this.maximoPlazasCoche = coches;
		
	}
	
	public void entradaMoto() {
		if(plazasMoto < maximoPlazasMoto) {
			plazasMoto++;
			notificaCambio();
		}
	}
	
	public void salidaMoto() {
		if(plazasMoto > 0) {
			plazasMoto--;
			notificaCambio();
		}
	}
	
	public void entradaCoche() {
		if(plazasCoche < maximoPlazasCoche) {
			plazasCoche++;
			notificaCambio();
		}
	}
	
	public void salidaCoche() {
		if(plazasCoche > 0) {
			plazasCoche--;
			notificaCambio();
		}
	}
	
	public int getPlazasMoto() {
		return plazasMoto;
	}
	public int getMaximoPlazasMoto() {
		return maximoPlazasMoto;
	}
	
	public int getPlazasCoche() {
		return plazasCoche;
	}
	public int getMaximoPlazasCoche() {
		return maximoPlazasCoche;
	}
	
	public void agregarObservador(ControlPlazasParking ctrl) {
		listeners.add(ctrl);
	}
	
	public void eliminarObservador(ControlPlazasParking ctrl) {
		listeners.remove(ctrl);
	}
	
	private void notificaCambio() {
		ValorCambioEvento evento = new ValorCambioEvento(this, 1, 1);  // no entiendo para que son estos dos numeros.
		for(ControlPlazasParking x: listeners) {
			x.fuenteIncrementada(evento);
		}
	}
	

}