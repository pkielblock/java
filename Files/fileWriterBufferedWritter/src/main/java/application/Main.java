package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
        String path = "/tmp/out.txt";

        //FileWriter(path) creates/recreates the file
        //FileWriter(path, true) appends on the end of the file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line); //Writes the line withou breaking it
                bw.newLine(); //breaks the line
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}