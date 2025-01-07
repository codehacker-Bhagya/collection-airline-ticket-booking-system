package com.bhagya.practice.service;

import com.bhagya.practice.model.BillingAndCancellation;
import com.bhagya.practice.model.Passenger;

import java.util.ArrayList;
import java.util.Scanner;

public class BillingAndCancellationService {

    int billingIndex = 0;
    Scanner scanner = new Scanner(System.in);

    private ArrayList<BillingAndCancellation> billingAndCancellations = new ArrayList<>();

    public static void billingData(BillingAndCancellation billingAndCancellation) {
        System.out.println(billingAndCancellation);

    }

    public BillingAndCancellation BillingService(){

        int option =0;

        BillingAndCancellation billingAndCancellation = new BillingAndCancellation();

        System.out.println("Welcome to Airline booking System");
        System.out.println("Enter your option");
        option = Integer.parseInt(scanner.nextLine());

        System.out.println("Pls Select Your Payment Method");
        String method = scanner.nextLine();
        System.out.println("Enter Your UPI ID");
        int upiid = Integer.parseInt(scanner.nextLine());

        billingAndCancellations.set(billingIndex , billingAndCancellation);
        billingIndex++;
        billingAndCancellation.setPaymentMethod(method);
        billingAndCancellation.setUpiid(upiid);

        return billingAndCancellation;

    }




}
