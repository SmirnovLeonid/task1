package logic;

import entity.Snikers;
import entity.Rafaello;
import entity.Sweets;
import entity.SweetsList;

import java.util.Scanner;

public class Santa {

     String[] sweetsList = {"Rafaello", "Snikers"};
    Present present = null;
    Scanner sc = null;
    String str = null;

    public Santa(){
        System.out.println("Hello, my name is Santa");
        System.out.println("I have next sweets here: ");
        System.out.println();
        System.out.println("1. "+SweetsList.Cake + " - price 10.0");
        System.out.println("2. " + SweetsList.Snikers + " - price 120.0");
        System.out.println("3. " + SweetsList.Snikers + " - price 140.0");
        System.out.println();
        System.out.println("Please enter which sweets you want to buy (enter stop when you're done)");
        createPresent();
        System.out.println("Please enter min and max sugar");
        System.out.println("Your Present is: " + findByStalk());
        present.sortBySugar();
        present.sortByWeight();
        System.out.println();
        System.out.println();
        System.out.println("Your present:");
        System.out.println("Total weight: " + present.getPresentWeight());
        System.out.println("Total price: " + present.getPresentPrice());
        present.print();


    }

    private void createPresent(){
        present = new Present();
        sc = new Scanner(System.in);
        do{
            str = sc.nextLine();
            switch(str.toLowerCase()){
                case "1": present.addSweets(new Rafaello(10, 10.0, 3)); break;
                case "2": present.addSweets(new Snikers(120, 20.0, 15 )); break;
                case "3": present.addSweets(new Snikers(120, 20.0, 45 )); break;           }
        }while(! str.equalsIgnoreCase("stop"));
    }

    private Sweets findByStalk(){
        sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        Sweets find = present.getSweetsBySugar(a,b);
        sc.close();

        return find;
    }

}
