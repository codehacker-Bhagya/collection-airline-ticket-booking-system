package com.bhagya.practice.service;

import com.bhagya.practice.model.BillingAndCancellation;
import com.bhagya.practice.model.Flight;
import com.bhagya.practice.model.Passenger;
import com.bhagya.practice.model.Ticket;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class AirlineTicketServiceDemo {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int option = 0;

        PassengerService passengerService = new PassengerService();
        Passenger passenger = passengerService.acceptPassenger();
        // Passenger passenger = passengerService.displayPassenger();

        FlightService flightService = new FlightService();
        Flight flight = flightService.FlightInformation();

        TicketService ticketService = new TicketService();
        Ticket ticketbooking = ticketService.TicketBooking();

        BillingAndCancellationService billingAndCancellationService = new BillingAndCancellationService();
        BillingAndCancellation billingAndCancellation= billingAndCancellationService.BillingService();


        do {
            System.out.println("1. Passenger Registration");
            System.out.println("2. information About Flight");
            System.out.println("3. book your Ticket here");
            System.out.println("4. Billing And Ticket Cancellation Details");
            System.out.println("5. Diplay Passenger");
            System.out.println("0. Exit ");

            option = Integer.parseInt(scanner.nextLine());


            switch (option) {
                case 1:
                   PassengerService.passengerData( passenger );
                    break;
                case 2:
                    FlightService.flightData(flight);
                    break;
                case 3:
                   TicketService.ticketData(ticketbooking);
                    break;

                    case 4:
                   BillingAndCancellationService.billingData(billingAndCancellation);
                    break;
                case 5:
                    PassengerService.displayPassenger();
                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Option");

            }

        } while (option != 0);





    }


    }

