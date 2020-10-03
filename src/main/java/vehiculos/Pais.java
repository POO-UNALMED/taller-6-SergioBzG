package vehiculos;
import java.util.*;

public class Pais {
	String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		int contador1 = 0;
		int contador2 = 0;
		Pais mayor = null;
		for(int i = 0; i < Vehiculo.paises.size(); i++) {
			Pais p = Vehiculo.paises.get(i);
			for(int j = 0; i < Vehiculo.paises.size(); i++) {
				if(p == Vehiculo.paises.get(j)) {
					contador1 += 1;
					
				}
			}
			if(contador1 > contador2) {
				contador2 = contador1;
				mayor = p;
			}
		}
		return mayor;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
}
