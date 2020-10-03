package vehiculos;

public class Automovil extends Vehiculo {
	int puestos;
	static int cantidad;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		cantidad++;
	}
	public static int getCantidad() {
		return cantidad;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public int getPuestos() {
		return this.puestos;
	}	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getPlaca() {
		return this.placa;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getPuertas() {
		return this.puertas;
	}
	public void setVelocidadMaxima(int velocidad) {
		this.velocidadMaxima = velocidad;
	}
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getPeso() {
		return this.peso;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public String getTraccion() {
		return this.traccion;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	
}
