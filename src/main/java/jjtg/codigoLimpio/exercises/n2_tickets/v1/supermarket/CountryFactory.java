package jjtg.codigoLimpio.exercises.n2_tickets.v1.supermarket;

public abstract class CountryFactory {
	
	private static CountryFactory countryFactory;
	
	protected CountryFactory() {
		
	}
	
	public static CountryFactory instance() {
		
		if(countryFactory == null) {
			
			countryFactory = new SpanishFactory();			
		}
		
		return countryFactory;
	}
	
	protected Menu menu;
	
	public abstract Menu getMenu();
	
	public abstract Ticket getTicket();

	

}
