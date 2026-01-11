package com.ticket.booking;

public class Seat {
	

	    private int seatNumber;
	    private boolean booked = false;

	    public Seat(int seatNumber) {
	        this.seatNumber = seatNumber;
	    }

	    // synchronized method
	    public synchronized void bookSeat(String userName) {

	        if (!booked) {
	            System.out.println(userName + " is booking seat " + seatNumber);

	            try {
	                Thread.sleep(1000); // simulate delay
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	            booked = true;
	            System.out.println("Seat " + seatNumber + " successfully booked by " + userName);
	        } else {
	            System.out.println("Seat " + seatNumber + " already booked ❌ | " + userName + " failed");
	        }
	    }
	}

