package util;

import java.util.Scanner;

import model.Cliente;

public class ClienteUtil {
	
	public Cliente crearCliente() {
		Cliente cliente = new Cliente();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese nombre de cliente...");
		String nombre = input.nextLine();
		cliente.setNombre(nombre);
		System.out.println();
			
		System.out.println("Ingrese rut de cliente...");
		cliente.setRut(input.nextLine());
		System.out.println();
			
		System.out.println("Ingrese fecha de nacimiento de cliente... (dd/MM/yyyy)");
		cliente.setFechaNacimiento(input.nextLine());
		System.out.println();
		
		System.out.println();
				
		return cliente;
	}
	

}
