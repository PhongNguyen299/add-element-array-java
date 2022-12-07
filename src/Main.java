import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr,arrN;
        int i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int size = scanner.nextInt();
        arr = new int [size];
        arrN = new int [size+1];

        for (i = 0; i < size ;i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Property list: ");
        for (j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println("\nEnter number you want to insert: ");
        int num = scanner.nextInt();
        System.out.println("Where you want to insert? ");
        int x = scanner.nextInt();

        for (i = j = 0; i <= size ; i++){
            if (i != x) {
                arrN[i] = arr[j];
                j++;
            } else {
                arrN[i] = num;
            }
        }

        for (j = 0; j < size+1; j++){
            System.out.print(arrN[j] + "\t");
        }
    }
}