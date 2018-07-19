package jjtg.codigoLimpio.exercises.n2_tickets.v1.supermarket;

import jjtg.codigoLimpio.exercises.n2_tickets.v1.util.Clock;

public class Supermarket {

	private Menu menu;
	
	private Supermarket() {
		
		menu = CountryFactory.instance().getMenu();		
	}

	private void sell() {
					
		Clock clock = new Clock();
		
		do {
			Ticket ticket = CountryFactory.instance().getTicket();
			
			menu.execute(ticket);
						
		} while (!clock.isNowOrLater(5) );
	}

	public static void main(String[] args) {
		new Supermarket().sell();
	}
}
