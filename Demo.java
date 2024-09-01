package BusResv;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

    public static void main(String[] args) {

        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        // Add buses to the list
        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, true, 50));
        buses.add(new Bus(3, true, 48));

        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);

        // Display bus information
        for (Bus b : buses) {
            b.displayBusInfo();
        }

        // Booking loop
        while (userOpt == 1) {
            System.out.println("Enter 1 to Book and 2 to exit");
            userOpt = scanner.nextInt();
            if (userOpt == 1) {
                Booking booking = new Booking();
                if (booking.isAvailable(bookings, buses)) {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                } else {
                    System.out.println("Sorry. Bus is full. Try another bus or date.");
                }
            }
        }

        scanner.close();
    }
}
