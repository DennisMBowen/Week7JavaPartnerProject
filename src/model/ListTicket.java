/**
 * @author Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Oct 12, 2022
 */
package model;

public class ListTicket {
	private Double price;
	private int ticketsRemaining;
	private final int maxTickets = 50; //constant value?
	
	//Getters and Setters
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getTicketsRemaining() {
		return ticketsRemaining;
	}
	public void setTicketsRemaining(int ticketsRemaining) {
		this.ticketsRemaining = ticketsRemaining;
	}
	
	
	//Constructors
	public ListTicket() {
		super();
	}
	
	public ListTicket(Double price) {
		super();
		this.price = price;
	}
	
	//Methods
	
	
	@Override
	public String toString() {
		return "ListTicket [price=" + price + ", ticketsRemaining=" + ticketsRemaining + ", maxTickets=" + maxTickets
				+ "]";
	}
	
	
}
