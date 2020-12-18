package util;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import model.Cliente;
import model.Evento;

public class Edad {
	
	public boolean verificaEdad(Evento evento, Cliente cliente) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(cliente.getFechaNacimiento(), fmt);
		LocalDate ahora = LocalDate.now();
		
		Period periodo = Period.between(fechaNac, ahora);

		if (periodo.getYears()>evento.getEdadMinima()) {
			return true;
		}else {
			return false;
		}
	}

}
