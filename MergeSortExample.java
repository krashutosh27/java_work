import java.util.Scanner;

class Merge {
    int[] A, B, C;

    private void input(int[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter " + arr.length + " Elements - ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    private void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    void inputArray1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Element in A Array - ");
        int n = sc.nextInt();

        A = new int[n];

        input(A);
        sort(A);
    }

    void inputArray2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Element in B Array  - ");
        int n = sc.nextInt();

        B = new int[n];

        input(B);
        sort(B);
    }

    void merge() {
        C = new int[A.length + B.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        while (i < A.length)
        {
            C[k++] = A[i++];
        }

        while (j < B.length)
        {
            C[k++] = B[j++];
        }
    }

    void display() {
        System.out.print("Sorted " + C.length + " Elements in C Array - ");

        for (int j : C) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}

public class MergeSortExample {
    public static void main(String[] args) {
        Merge obj1 = new Merge();

        obj1.inputArray1();
        obj1.inputArray2();
        obj1.merge();
        obj1.display();
    }
}
 