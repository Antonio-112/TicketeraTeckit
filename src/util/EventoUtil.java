package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Cliente;
import model.Entrada;
import model.EntradaVip;
import model.Evento;
import model.Vendedores;

public class EventoUtil {
	
	public Evento crearEvento() {
		Evento evento = new Evento();
		Scanner leer = new Scanner(System.in);
		System.out.println("Bienvenido!...");
		System.out.println("Ingrese nombre del evento...");
			
		evento.setNombre(leer.next());
		System.out.println("Ingrese edad minima del evento: "+ evento.getNombre());
		evento.setEdadMinima(leer.nextInt());
			
		System.out.println("Creando evento "+evento.getNombre()+" (Edad minima: "+evento.getEdadMinima()+")");
		
		
		return evento;
		
	}
	public Evento comenzarEvento(Evento evento) {
		evento.setEnCurso(true);
		System.out.println("El evento "+evento.getNombre()+" se ha cambiado: <EnCurso>.");
		return evento;
	}
	
	public Evento venderEntrada(Evento evento, Cliente cliente, Vendedores vendedor) {
		Entrada entrada = new Entrada();
		Scanner leer = new Scanner(System.in);
		Edad edad = new Edad();
		List<Entrada> entradas = new ArrayList<Entrada>();
		
		entrada.setCliente(cliente.getNombre());
		entrada.setVendedor(vendedor.getNombre());
		entrada.setNombre("Entrada");

		
		if(edad.verificaEdad(evento, cliente)) {
			entrada.setUsada(false);
			
			System.out.println("Ingrese el asiento de la entrada...");
			entrada.setAsiento(leer.nextInt());
			
			System.out.println("Ingrese precio de entrada...");
			entrada.setPrecio(leer.nextInt());
		
		
			System.out.println("Vendiendo entrada a cliente "+cliente.getNombre()+" ("+cliente.getRut()+") para evento " + evento.getNombre());
			vendedor.setCantEntradasVendidas(vendedor.getCantEntradasVendidas()+1);
			
			entradas.add(entrada);
			evento.setEntradas(entradas);
			
			return evento;
		}else {
			System.out.println("No fue posible vender la entrada, cliente menor de edad...");
			return evento;
		}
		
	}
	
	public Evento venderEntradaVip(Evento evento, Cliente cliente, Vendedores vendedor) {
		EntradaVip entrada = new EntradaVip();
		Scanner leer = new Scanner(System.in);
		Edad edad = new Edad();
		List<EntradaVip> entradas = new ArrayList<EntradaVip>();

		entrada.setCliente(cliente.getNombre());
		entrada.setNombre("Entrada Vip");
		entrada.setVendedor(vendedor.getNombre());
		entrada.setVip(true);
		
		if(edad.verificaEdad(evento, cliente)) {
			entrada.setUsada(false);
			
			System.out.println("Ingrese el asiento de la entrada...");
			entrada.setAsiento(leer.nextInt());
				
			System.out.println("Ingrese precio de entrada...");
			entrada.setPrecio(leer.nextInt());
			
			
			System.out.println("Vendiendo entrada a cliente "+cliente.getNombre()+" ("+cliente.getRut()+") para evento " + evento.getNombre());
			vendedor.setCantEntradasVendidas(vendedor.getCantEntradasVendidas()+1);	
			entradas.add(entrada);
			evento.setEntradasVip(entradas);

			return evento;

		}else {
			System.out.println("No fue posible vender la entrada, cliente menor de edad...");
			return evento;

		}
		

	}
	public void utilizarEntrada(Evento evento, Cliente cliente) {
		if(evento.isEnCurso()) {
			String nombre = cliente.getNombre();
			if (evento.getEntradas()
					.stream().filter(x->!x.isUsada())
					.anyMatch(x-> x.getCliente().equals(nombre))) {
				
				System.out.println("Usando entrada con cliente "+nombre+" ("+cliente.getRut()+") para evento "+evento.getNombre());
				evento.getEntradas().stream().filter(x->x.getCliente().equals(nombre)).forEach(x->x.setUsada(true));
				System.out.println("Entrada encontrada, "+nombre+" puede pasar.");
				
			}else if (evento.getEntradasVip()
					.stream().filter(x->!x.isUsada())
					.anyMatch(x-> x.getCliente().equals(nombre))) {
				
				System.out.println("Usando entrada con cliente "+nombre+" ("+cliente.getRut()+") para evento "+evento.getNombre());
				evento.getEntradasVip().stream().filter(x->x.getCliente().equals(nombre)).forEach(x->x.setUsada(true));
				System.out.println("Entrada encontrada, "+nombre+" puede pasar.");
				
			}else {
				System.out.println("Usando entrada con cliente "+nombre+" ("+cliente.getRut()+") para evento "+evento.getNombre());
				System.out.println("Entrada para rut "+cliente.getRut()+" ya fue usada, no puede pasar.");

			}
		}else if(!evento.isEnCurso()){
			System.out.println("Usando entrada con cliente "+cliente.getNombre()+" ("+cliente.getRut()+") para evento "+evento.getNombre());
			System.out.println("No se puede usar la entrada porque el evento "+evento.getNombre()+" no está en curso.");
			
		}
	}

}
