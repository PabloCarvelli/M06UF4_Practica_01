package pack01;

import java.util.*;

public class Parking {
	
	ArrayList<Plaza> p;
	
	public Parking(int motos, int coches) {
		
		for(int i = 0; i < motos; i++) {
			p.add(new Plaza("Moto"));
		}
		
		for(int i = 0; i < coches; i++) {
			p.add(new Plaza("COche"));
		}
		
	}
	

}
