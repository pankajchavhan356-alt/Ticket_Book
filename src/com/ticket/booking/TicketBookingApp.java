package com.ticket.booking;

public class TicketBookingApp {
 

	    public static void main(String[] args) {

	        Seat seat1 = new Seat(101);

	        User user1 = new User(seat1, "Ravi");
	        User user2 = new User(seat1, "Amit");
	        User user3 = new User(seat1, "Neha");

	        user1.start();
	        user2.start();
	        user3.start();
	        //System.out.println(ok);
	    }
	}

