package Task1;

import java.util.Scanner;

public class Project {
    private String name;
    private int cost;
    private String type;
    private boolean  isGovermental;


    public Project() {
        this.name = "null";
        this.cost = 0;
        this.type = "null";
        this.isGovermental = false;
    }



    public Project(String name, int cost, String type, boolean isGovermental) {
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.isGovermental = isGovermental;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isGovermental() {
        return isGovermental;
    }
    public void setGovermental(boolean govermental) {
        isGovermental = govermental;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", type='" + type + '\'' +
                ", isGovermental=" + isGovermental +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int totalCost = 0;
       int governmentPayment = 0;

        System.out.println("Бюджет Города:");
        int budget = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Специальный Тип:");
        String specType = scanner.nextLine();

        System.out.println("Введите количество проектов:");
        int projSize = scanner.nextInt();
        scanner.nextLine();

        Project[] projects = new Project[projSize];

        for (int i = 0; i < projSize; i++){     //Проекты

            System.out.println("[Название]");
            String name = scanner.nextLine();

            System.out.println("[Cтоимость проект]");
            int cost = Integer.parseInt(scanner.nextLine());


            System.out.println("[Tип строения (Business/Factory/Science)]");
            String type = scanner.nextLine();
            if (specType.equals(type))
                cost -= cost * 20/100; // 80%



            System.out.println("[Является ли проект государственным (0/1)]");
            int input = scanner.nextInt();
            boolean isGovermental = input == 1;
            if (isGovermental){   // (isGovermental == true), то его стоимость полностью оплачивается государством
                governmentPayment += cost;
            } else
                totalCost += cost;      // (isGovermental == false), то его стоимость He оплачивается государством

            scanner.nextLine();

            projects[i] = new Project(name,cost, type, isGovermental);
            System.out.println(" ");
        }

        if (totalCost > budget){
            governmentPayment = governmentPayment + (totalCost - budget);
        }

        System.out.println(governmentPayment + " уйдет из бюджета государства на строительство проектов в городе.");
    }
}
