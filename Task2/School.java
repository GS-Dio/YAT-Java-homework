package Task2;

import java.util.Scanner;

public class School {
    String title;
    String spec_type; //тип эспера, на котором специализируется школа ("pyrokynetic", "telekinetic", "medium")
    int espCount;
    Esper[] espers;
    int enrolledInSchool;


    public School(String title, String spec_type, int espCount, Esper[] espers, int enrolledInSchool) {
        this.title = title;
        this.spec_type = spec_type;
        this.espCount = espCount;
        this.espers = espers;
        this.enrolledInSchool = enrolledInSchool;
    }

    public String getEnrolledInfo(){
        return title + "-" + enrolledInSchool;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int SpecialSchool = 0;
        System.out.println("Количество школ:");
        int schoolCount = scanner.nextInt();
        scanner.nextLine();

        School[] schools = new School[schoolCount];

        for (int i = 0; i < schoolCount; i++){
            int enrolledInSchool = 0;
            System.out.println("Название школы:");
            String title = scanner.nextLine();
            System.out.println("Тип школы:");
            String specType = scanner.nextLine();
            System.out.println("Количество желающих эсперов:");
            int espCount = scanner.nextInt();
            scanner.nextLine();

            Esper[] espers = new Esper[espCount];

            for (int j = 0; j < espCount; j++){
                System.out.println("Имя эспера:");
                String name = scanner.nextLine();; //имя

                System.out.println("Уровень сил эспера:");
                int mighty = scanner.nextInt();; //уровень сил
                scanner.nextLine();

                System.out.println("Тип эспера:");
                String type = scanner.nextLine();; // тип

                if (mighty > 10 && mighty < 1000){
                    enrolledInSchool++;
                } else if (!type.equals(specType) && mighty >= 1000) {
                    SpecialSchool++;
                }

                espers[j] = new Esper(name,mighty,type);
            }
                schools[i] = new School(title,specType,espCount,espers,enrolledInSchool);

        }
        for (int i = 0; i < schoolCount; i++){
        System.out.println(schools[i].getEnrolledInfo());
        }
        System.out.println("SpecialSchool " + SpecialSchool);
    }
}
