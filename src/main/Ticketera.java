package main;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Entrada;
import model.Evento;
import model.Vendedores;
import util.ClienteUtil;
import util.EventoUtil;
import util.VendedorUtil;

public class Ticketera {

	public static void main(String[] args) {
		EventoUtil evento = new EventoUtil();
		ClienteUtil cliente = new ClienteUtil();
		VendedorUtil vendedor = new VendedorUtil();
		//Cliente cliente1 = cliente.crearCliente();
		Cliente cliente1 = new Cliente("19756086-k","Antonio","10/12/1997");
		Vendedores vendedor1 = new Vendedores("19756086-k","Marco","19/12/1995",0);
		//Vendedores vendedor1 = vendedor.crearVendedor();

		Evento evento1 = evento.crearEvento();
		
		Cliente cliente2 = new Cliente("Alexis","10441452-4","10/12/2003");

		System.out.println(cliente1.toString());
		System.out.println();
		System.out.println(evento1.toString());
		System.out.println();
		System.out.println(vendedor1.toString());
		System.out.println();
		
		evento.venderEntrada(evento1, cliente1, vendedor1);
		evento.comenzarEvento(evento1);
		evento.utilizarEntrada(evento1, cliente1);
		
		System.out.println(evento1.getEntradas());

		System.out.println(vendedor1.toString());

		
	}

}
