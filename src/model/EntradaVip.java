package model;

public class EntradaVip extends Entrada {

	private boolean vip;

	
	public EntradaVip() {
		super();
	}

	

	public EntradaVip(String nombre, Integer precio, Integer asiento, String cliente, String vendedor, boolean usada,
			boolean usada2, boolean vip) {
		super(nombre, precio, asiento, cliente, vendedor, usada);
		this.vip = vip;
	}



	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		return "EntradaVip [vip=" + vip + "]";
	}
	
	
}
