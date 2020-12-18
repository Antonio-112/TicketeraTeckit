package util;

import java.util.Scanner;

import model.Cliente;

public class ClienteUtil {
	
	public Cliente crearCliente() {
		Cliente cliente = new Cliente();
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese nombre de cliente...");
		cliente.setNombre(leer.next());
			
		System.out.println("Ingrese rut de cliente...");
		cliente.setRut(leer.next());
			
		System.out.println("Ingrese fecha de nacimiento de cliente... (dd/MM/yyyy)");
		cliente.setFechaNacimiento(leer.next());
		
		
		return cliente;
	}
	

}
