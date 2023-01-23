package Application;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99991122");

        cookies.remove("email");
        cookies.put("phone", "99991133"); //sobrescreve o valor se a chave for igual

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone Number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email")); // retorna null se nao existe
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES: ");

        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}