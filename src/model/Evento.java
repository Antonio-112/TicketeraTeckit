package model;

import java.util.List;

public class Evento {

	private String nombre;
	private Integer edadMinima;
	private List<Entrada> entradas;
	private List<EntradaVip> entradasVip;
	private boolean enCurso;
	private Integer recaudacion;

	public Evento() {
		super();
	}

	public Evento(String nombre, Integer edadMinima, List<Entrada> entradas, boolean enCurso, List<EntradaVip> entradasVip) {
		super();
		this.setEnCurso(enCurso);
		this.nombre = nombre;
		this.edadMinima = edadMinima;
		this.entradas = entradas;
		this.entradasVip = entradasVip;
		this.recaudacion = 0;

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

	public List<EntradaVip> getEntradasVip() {
		return entradasVip;
	}

	public void setEntradasVip(List<EntradaVip> entradasVip) {
		this.entradasVip = entradasVip;
	}

	public boolean isEnCurso() {
		return enCurso;
	}

	public void setEnCurso(boolean enCurso) {
		this.enCurso = enCurso;
	}

	public void setRecaudaicon(Integer recaudacion) {
		this.recaudacion = recaudacion;
	}

	public Integer getRecaudacion() {
		return recaudacion;
	}

	@Override
	public String toString() {
		return "Evento [nombre=" + nombre + ", edadMinima=" + edadMinima + ", entradas=" + entradas + ", recaudacion= "
				+ recaudacion + "]";
	}

}
