package vehiculos;

public class Camion extends Vehiculo {
	int ejes;
	static int cantidad;

	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		cantidad++;
	}
	public static int getCantidad() {
		return cantidad;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public int getEjes() {
		return this.ejes;
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