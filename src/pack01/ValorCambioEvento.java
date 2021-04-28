package pack01;

import java.util.*;

public class ValorCambioEvento extends EventObject {
	
	private int plazasMoto = 0;
	private int plazasCoche = 0;
	
	public ValorCambioEvento(Parking o, int plazasMoto, int plazasCoche) {
		super(o);
		this.plazasMoto = plazasMoto;
		this.plazasCoche = plazasCoche;
		
	}
	
	@Override
	public Parking getSource() {
		return (Parking)super.getSource();
	}
	
	public int getPlazasMoto() {
		return plazasMoto;
	}
	
	public int getPlazasCoches() {
		return plazasCoche;
	}
	
}
