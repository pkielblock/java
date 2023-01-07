package com.dzk.Application;

import java.util.Scanner;
import com.dzk.Entities.Rent;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberRooms;
        do {
            System.out.println("How many rooms will be rented?");
            numberRooms = sc.nextInt();
        } while (numberRooms > 10 || numberRooms < 1);

        String name, email;
        int room;

        Rent[] vect = new Rent[10];

        for (int i = 0; i < numberRooms; i++) {
            System.out.printf("Rent #%d%n", i+1);
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.next();
            System.out.print("Email: ");
            email = sc.next();
            System.out.print("Room: ");
            room = sc.nextInt();
            System.out.println(" ");

            vect[room] = new Rent(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for (Rent rent : vect) {
            if (rent != null) {
                System.out.println(rent.getRoom() + ": " + rent.getName() + ", " + rent.getEmail());
            }
        }

        sc.close();
    }
}