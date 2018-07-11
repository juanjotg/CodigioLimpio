package jjtg.codigoLimpio.exercises.n2_tickets.v1.supermarket;




public class Supermarket {

	
	private Supermarket() {
		
	}

	private void sell() {
	
		boolean cerrar = true;
		
		do {
			Ticket ticket = CountryFactory.instance().createTicket();
			Menu menu = CountryFactory.instance().createMenu();
			menu.execute(ticket);
		} while (!cerrar );
	}

	public static void main(String[] args) {
		new Supermarket().sell();
	}
}
