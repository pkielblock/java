package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Travelling to New Zeland", "I'm going to visit this wonderful country", 12);
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow, that's awesome!");
        p1.addComment(c1);
        p1.addComment(c2);

        Post p2 = new Post(sdf.parse("26/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}