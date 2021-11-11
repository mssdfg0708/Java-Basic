package Second;

import java.io.*;
import java.util.*;

public class HashMapEx01 {
    public static void main(String[] args) throws IOException{
        HashMap accounts = new HashMap();
        accounts.put("ID01", "PassWord01");
        accounts.put("ID02", "PassWord02");
        accounts.put("ID03", "PassWord");
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
        Set accountsSet = accounts.entrySet();
        Iterator iterator = accountsSet.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + " / " +  entry.getValue());
        }
    }
}
