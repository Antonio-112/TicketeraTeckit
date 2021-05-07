package model;

public class Vendedores extends Cliente{
	
	private Integer cantEntradasVendidas;

	public Vendedores() {
		super();
	}

	public Vendedores(String rut, String nombre, String fechaNacimiento, Integer cantEntradasVendidas) {
		super(rut,nombre,fechaNacimiento);
		this.cantEntradasVendidas = cantEntradasVendidas;
	}


	public Integer getCantEntradasVendidas() {
		return cantEntradasVendidas;
	}

	public void setCantEntradasVendidas(Integer cantEntradasVendidas) {
		this.cantEntradasVendidas = cantEntradasVendidas;
	}

	@Override
	public String toString() {
		return "Vendedores [Nombre = "+getNombre()+"cantEntradasVendidas=" + cantEntradasVendidas + ", Rut=" + getRut() + ", FechaNacimiento=" + getFechaNacimiento();
	}
	
	
	
	
	

}
