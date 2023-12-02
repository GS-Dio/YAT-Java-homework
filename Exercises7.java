import java.util.Scanner;
import java.util.Arrays;

public class Exercises7 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Exercise25();
    }
    public static void Exercise1() {
        int a[] = new int[5];
        a[0] = 5;
        a[1] = 11;
        a[2] = 22;
        a[3] = 33;
        a[4] = 44;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
    }
    public static void Exercise2() {
        int a[] = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
        System.out.println(sum / a.length);
    }
    public static void Exercise3() {
        int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Sum Values of Array = " + sum);
    }
    public static void Exercise4() {
        int arr[] = new int[]{23, 5, 67, 20, 3, 30, 79, 3, 70, 2};  //дан массив из чисел

        for (int i = arr.length - 1; i > 0; i--) {     // цикл повториться столько сколько элементов в массиве
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {    // если 1 элемент больше второго то они поменяются местами
                    int a = arr[j];            // Переменная что будет хранить значение первого элемента
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));  // вывод
    }
    public static void Exercise5() {
        int arr[] = new int[]{23, 5, 67, 20, 3, 30, 79, 3, 70, 2};  //дан массив из чисел

        for(int i = arr.length -1 ; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(arr[j] < arr[j+1]){
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void Exercise6() {
      int arr[] = {23, 4, 32, 5, 75};
      for(int i = arr.length - 1; i > 0; i--){
          for(int j = 0; j < i; j++){
              if(arr[j] > arr[j + 1]) {
                  int a = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = a;
              }
          }
      }
        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальное число: " + arr[0]);
        System.out.println("Максимальное число: " + arr[arr.length - 1]);
    }
    public static void Exercise7() {
        int arr[] = {23, 4, 32, 5, 75};
        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        System.out.println("Минимальное число: " + arr[0]);
        System.out.println("Максемальное число: " + arr[arr.length - 1]);
    }
    public static void Exercise8() {
        int a[] = {23, 45, 67, 34, 78};
        System.out.print("Нечетные элементы массива = ");
        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 != 0)
                System.out.print(a[i] + " ");
        }
    }
    public static void Exercise9() {
        int a[] = {23, 45, 89, 34, 12};
        System.out.print("Четные элементы массива = ");
        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0)
                System.out.print(a[i] + " ");
        }
    }
    public static void Exercise10() {
        int a[] = {12, 34, 59, 45, 22};
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 != 0)
               sum += a[i];
        }
        System.out.print("Сумма нечетных элементов массива = " + sum);
    }
    public static void Exercise11() {
        int a[] = {56, 78, 45, 79, 34};
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0)
                sum += a[i];
        }
        System.out.print("Сумма четных элементов массива = " + sum);
    }
    public static void Exercise12() {
        int a[] = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i]*a[i]*a[i];
        }
        System.out.println("Сумма элементов кубического массива = " + sum);
    }
    public static void Exercise13() { //** Упражнение 13: Напишите программу для копирования элементов одного массива в другой массив.**
        int a[] = {1, 2, 3, 4, 5};
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println(Arrays.toString(b));
    }
    public static void Exercise14() {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 7, 8, 9, 10};
        int c[] = new int[a.length + b.length];

        for (int i = 0, j = 0; i < c.length; i++) {

            if(c[a.length - 1] != a[a.length - 1 ]){
                c[i] = a[i];
            } else
                c[i] = b[j++];
        }
        System.out.println(Arrays.toString(c));
    }
    public static void Exercise15() {
        int a[] =  {67, -4, 3, -5, 44};
        System.out.print("Положительные элементы массива = ");
        for (int i = 0; i < a.length; i++){
            if(a[i] >= 0){
                System.out.print(a[i] + " ");
            }
        }
    }
    public static void Exercise16() {
        int a[] = {-45, 32, -7, 3, -6};
        System.out.print("Элементы отрицательного массива = ");
        for (int i = 0; i < a.length; i++){
            if(a[i] < 0){
                System.out.print(a[i] + " ");
            }
        }
    }
    public static void Exercise17() {
        int a[] =  {1, -2, 3, 3, 4};
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] >= 0){
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
    public static void Exercise18() {
        int a[] =  {10, -23, 45, -10, 30};
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] < 0){
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
    public static void Exercise19() {
        int a[] = {10, 20, 30, 40, 50};
        System.out.println("Какой элемент найти? ");
        System.out.println(Arrays.toString(a));
        int find = scanner.nextInt();
        for (int i = 0; i < a.length; i++){
            if (a[i] == find)
                System.out.println("Элемент >>" + find + "<< найден в позиции = " + (i+1) + " по индексу = [" + i + "]");
        }
    }
    public static void Exercise20() {
        int a[] = {10, 10, 20, 20, 30};

        for (int i = 0, j = 0; i < a.length - 1; i++){
            if(a[j] == a[i + 1]){
                a[j++] = 0;
            }else
                j++;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void Exercise21() {
        int a[] = {10, 20, 40, 20, 10};
        System.out.print("Отобразить уникальные элементы массива = ");
        for (int i = 0, j = 0; i < a.length - 1; i++){
            if(a[j] == a[i + 1]){
                System.out.print(a[j] + " ");
            }else
                j++;
            j++;
        }
    }
    public static void Exercise22() {
        int arr[] = {10, 20, 5, 2, 30};

        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        System.out.println("Второй наименьший элемент = " + arr[1]);
    }
    public static void Exercise23() {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 7, 8, 9, 10};
        int c[] = new int[a.length + b.length];
        int j = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                c[j] = a[i];
                j++;
            }
        }
        for (int i = 0; i < b.length; i++){
            if(b[i] % 2 == 0){
                c[j] = a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(c));
    }
    public static void Exercise24() {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 7, 8, 9, 10};
        int c[] = new int[a.length + b.length];
        int j = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 != 0){
                c[j] = a[i];
                j++;
            }
        }
        for (int i = 0; i < b.length; i++){
            if(b[i] % 2 != 0){
                c[j] = a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(c));
    }
    public static void Exercise25() {
        int a[] =  {10, 20, 30, 40, 50};
        int b[] = {10, 30, 60, 50, 70};
        int c[] = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++){
            c[i+a.length] = b[i];
        }
//        System.out.println(Arrays.toString(c));
        int W = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1]) {
                System.out.println("Общий элемент массива = " + c[i]);
                W++;
            }
        }
    }
    public static void Exercise26() {
        int arr[] = {10, 20, 30, 40, 50};

        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        System.out.println("Второй по величине элемент = " + arr[3]);
    }
    public static void Exercise27() {
        int a[] = {1, 2, 4, 5, 6, 7};
        int b = 1;    //6
          // 6 - 5
        for (int i = 0; i < a.length; i++){
            if(a[i] != (b + i)) {
                System.out.println("Пропущенное число " + (b + i));
                b++;
            }
        }

    }
}
