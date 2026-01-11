package com.ticket.booking;

public class User extends Thread{
	



	    private Seat seat;
	    private String userName;

	    public User(Seat seat, String userName) {
	        this.seat = seat;
	        this.userName = userName;
	    }

	    @Override
	    public void run() {
	        seat.bookSeat(userName);
	    }
	}

