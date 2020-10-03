package vehiculos;

public class Fabricante {
	String nombre;
    Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre; this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante mayor = null;
		for(int i = 0; i < Vehiculo.companias.size(); i++) {
			int contador1 = 0;
			int contador2 = 0;
			Fabricante f = Vehiculo.companias.get(i);
			for(int j = 0; i < Vehiculo.companias.size(); i++) {
				if(f == Vehiculo.companias.get(j)) {
					contador1 += 1;
					
				}
			}
			if(contador1 > contador2) {
				contador2 = contador1;
				mayor = f;
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
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Pais getPais() {
		return this.pais;
	}
}
