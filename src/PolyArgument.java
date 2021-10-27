import java.util.*;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = price/10;
    }
    Product() {
    }
}
class Tv02 extends Product {
    Tv02() {
        super(100);
    }
    public String toString() { return "Tv"; }
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() { return "Computer"; }
}

class Audio extends Product {
    Audio() {
        super(50);
    }
    public String toString() { return "Audio"; }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Vector items = new Vector();

    void buy(Product product) {
        if (money < product.price) {
            System.out.println("Denied to Buy " + product);
            return;
        }
        money -= product.price;
        bonusPoint += product.bonusPoint;
        items.add(product);
    }

    void refund(Product product) {
        if (items.remove(product)) {
            money += product.price;
            bonusPoint -= product.bonusPoint;
            System.out.println("Refund " + product);
        }
        else {
            System.out.println("Fail to refund " + product);
        }
    }

    void summary() {
        int sum = 0;
        StringBuilder itemList = new StringBuilder();

        if (items.isEmpty()) {
            return;
        }
        for (Object o : items) {
            Product item = (Product) o;
            sum += item.price;
            itemList.append(item).append(" ");
            System.out.print("Item : " + item);
            System.out.println("\t Price : " + item.price);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Your total cost : " + sum);
        System.out.println("Your Item List : " + itemList);
        System.out.println("-----------------------------------------------------");
    }
}

public class PolyArgument {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Tv02 tv = new Tv02();
        Computer computer = new Computer();
        Audio audio = new Audio();

        buyer.buy(tv);
        buyer.buy(computer);
        buyer.buy(computer);
        buyer.buy(computer);
        buyer.buy(computer);
        buyer.buy(audio);
        buyer.buy(computer);
        buyer.buy(computer);

        buyer.summary();

        buyer.refund(tv);
        buyer.refund(tv);
        buyer.refund(computer);

        buyer.summary();
    }
}
