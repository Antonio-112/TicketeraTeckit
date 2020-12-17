package model;

public class EntradaVip extends Entrada {

	private boolean vip;

	
	public EntradaVip() {
		super();
	}

	public EntradaVip(String nombre, Integer precio, Integer asiento, String cliente, String vendedor, boolean vip,
			boolean vip2) {
		super(nombre, precio, asiento, cliente, vendedor, vip);
		vip = vip2;
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
