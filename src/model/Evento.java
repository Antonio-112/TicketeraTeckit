package model;

import java.util.List;

public class Evento {
	
	private String nombre;
	private Integer edadMinima;
	private List<Entrada> entradas;
	public Evento() {
		super();
	}
	public Evento(String nombre, Integer edadMinima, List<Entrada> entradas) {
		super();
		this.nombre = nombre;
		this.edadMinima = edadMinima;
		this.entradas = entradas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(Integer edadMinima) {
		this.edadMinima = edadMinima;
	}
	public List<Entrada> getEntradas() {
		return entradas;
	}
	public void setEntradas(List<Entrada> entradas) {
		this.entradas = entradas;
	}
	@Override
	public String toString() {
		return "Evento [nombre=" + nombre + ", edadMinima=" + edadMinima + ", entradas=" + entradas + "]";
	}
	
	

}
