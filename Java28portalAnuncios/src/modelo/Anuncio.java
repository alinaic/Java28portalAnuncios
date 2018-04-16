package modelo;

import javax.management.loading.PrivateClassLoader;

public class Anuncio {
	
	private String titulo;
	private double precio;
	private String descripcion;
	
	public Anuncio(){
		
	}

	public Anuncio(String titulo, double precio, String descripcion) {
		super();
		this.titulo = titulo;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Anuncio [titulo=" + titulo + ", precio=" + precio
				+ ", descripcion=" + descripcion + "]";
	}

}
