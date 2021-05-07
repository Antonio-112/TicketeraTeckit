package util;

import java.util.Scanner;

import model.Vendedores;

public class VendedorUtil {
	
	
	public Vendedores crearVendedor() {
		
		Scanner leer = new Scanner(System.in);
		Vendedores vendedor = new Vendedores();
		vendedor.setCantEntradasVendidas(0);

		System.out.println("Ingrese nombre de vendedor...");
		vendedor.setNombre(leer.next());
			
		System.out.println("Ingrese rut de vendedor...");
		vendedor.setRut(leer.next());
			
		System.out.println("Ingrese fecha de nacimiento de vendedor... (dd/MM/yyyy)");
		vendedor.setFechaNacimiento(leer.next());
					
		return vendedor;
	}

}
