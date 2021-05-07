package main;

import model.Cliente;
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
		
				
		Evento evento1 = evento.crearEvento();
		
		Cliente cliente1 = cliente.crearCliente();
		Cliente cliente2 = cliente.crearCliente();
		
		Vendedores vendedor1 = vendedor.crearVendedor();
		
		
		System.out.println("Cliente: "+ cliente1.getNombre());
		System.out.println(cliente1.toString());
		System.out.println();
		System.out.println("Evento: " + evento1.getNombre());
		System.out.println(evento1.toString());
		System.out.println();
		System.out.println("Vendedor: "+ vendedor1.getNombre());
		System.out.println(vendedor1.toString());
		System.out.println("\n");
		
		evento.venderEntrada(evento1, cliente1, vendedor1);
		evento.venderEntradaVip(evento1, cliente2, vendedor1);
		
		evento.comenzarEvento(evento1);
		
		evento1.getEntradasVip().stream().forEach(str -> System.out.println("Entrada: " + str));
		
		evento.utilizarEntrada(evento1, cliente1);
		evento.utilizarEntrada(evento1, cliente2);
		
		System.out.println(evento1.getEntradas());

		System.out.println(vendedor1.toString());

		
	}

}
