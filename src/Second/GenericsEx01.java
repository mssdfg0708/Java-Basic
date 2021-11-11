package Second;

import java.io.*;
import java.util.*;

// Refactoring "HashMapEx01.java" File with Generics

public class GenericsEx01 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> accounts = new HashMap<>();
        accounts.put("ID01", "PassWord01");
        accounts.put("ID02", "PassWord02");
        accounts.put("ID03", "PassWord03");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Login Session");
        System.out.print("ID : ");
        String id = br.readLine().trim();
        System.out.print("PassWord : ");
        String password = br.readLine().trim();

        if (!accounts.containsKey(id)) {
            System.out.println("Check Your ID!");
            return;
        }
        if (!accounts.get(id).equals(password)) {
            System.out.println("Check Your PassWord!");
            return;
        }
        System.out.println("Login Success!");
        System.out.println("Hello! " + id);

        System.out.println("\n--- Account List ---");
        Set<Map.Entry<String, String>> accountsSet = accounts.entrySet();

        for (Map.Entry<String, String> entry : accountsSet) {
            System.out.println(entry.getKey() + " / " + entry.getValue());
        }
    }
}
