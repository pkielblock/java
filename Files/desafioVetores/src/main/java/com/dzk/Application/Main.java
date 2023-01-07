package com.dzk.Application;

import java.util.Scanner;
import com.dzk.Entities.Student;

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

        Student[] vect = new Student[10];

        for (int i = 0; i < numberRooms; i++) {
            System.out.printf("Rent #%d%n", i+1);
            System.out.println("Name: ");
            name = sc.next();
            System.out.println("Email: ");
            email = sc.next();
            System.out.println("Room: ");
            room = sc.nextInt();

            vect[room] = new Student(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for (Student student : vect) {
            if (student != null) {
                System.out.println(student.getRoom() + ": " + student.getName() + ", " + student.getEmail());
            }
        }

        sc.close();
    }
}