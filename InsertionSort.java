import java.util.Scanner;

class Sort {
    int[] arr;

    Sort() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Element - ");
        int n = sc.nextInt();

        arr = new int[n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter " + arr.length + " Elements - ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void sortOperation() {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    void display() {
        System.out.print("Sorted " + arr.length + " Elements - ");

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

public class InsertionSort {
    public static void main(String[] args) {
        Sort s = new Sort();
        s.input();
        s.sortOperation();
        s.display();
    }
}
