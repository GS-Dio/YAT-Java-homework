package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Colony {
    public String name; //название
    public int smetPrice; //стоимость за квадратный метр
    public int apCount; //количество апартаментов
    public Apartment[] aparts; //Список апартаментов

    public Colony(String name, int smetPrice, int apCount, Apartment[] aparts) {
        this.name = name;
        this.smetPrice = smetPrice;
        this.apCount = apCount;
        this.aparts = aparts;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество колоний:");
        int ColonyCount = scanner.nextInt();
        scanner.nextLine();
        Colony[] colonies = new Colony[ColonyCount];

        for (int i = 0; i < ColonyCount; i++) {
            System.out.println("Название колоний:");
            String name = scanner.nextLine(); //название

            System.out.println("Cтоимость за квадратный метр:");
            int smetPrice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Количество апартаментов:");
            int apCount = scanner.nextInt();
            scanner.nextLine();
            Apartment[] aparts = new Apartment[apCount]; //Список апартаментов

            for (int j = 0; j < apCount; j++) {
                System.out.println("Hазвание апартамента:");
                String title = scanner.nextLine();
                System.out.println("Kоличество квадратных метров:");
                int smet = scanner.nextInt();
                scanner.nextLine();
                int cost = smet * smetPrice;
                System.out.println("Tип строения (Cyberbricks/Carbonpanel/Nanolite):");
                String type = scanner.nextLine();
                if (type.equals("Cyberbricks")) {
                    cost *= (int) (cost * 0.5);
                } else if (type.equals("Carbonpanel"))
                    cost = (int) (cost * 0.8);

                aparts[j] = new Apartment(title, smet, type, cost);
            }
            int minCost = aparts[0].cost;

            for (int k = 0; k < aparts.length; k++) {
                if (minCost > aparts[k].cost) {
                    minCost = aparts[k].cost;

                }
            }

            colonies[i] = new Colony(name, smetPrice, apCount, aparts);
        }
        Apartment cheapestApartment = null;
        int cheapestColonyIndex = -1;

        for (int i = 0; i < colonies.length; i++) {
            for (int j = 0; j < colonies[i].aparts.length; j++) {
                Apartment apartment = colonies[i].aparts[j];
                if (cheapestApartment == null || apartment.cost < cheapestApartment.cost) {
                    cheapestApartment = apartment;
                    cheapestColonyIndex = i;
                }
            }
        }
        System.out.println("Самая дешевая квартира: " + cheapestApartment.toString() +
                    " " + colonies[cheapestColonyIndex].toString());

    }
}
