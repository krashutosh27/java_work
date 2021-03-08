import java.util.Scanner;

class MatrixAddition extends Thread {
    int A[][];
    int B[][];
    int C[][];
    int N;

    MatrixAddition(int[][] A, int[][] B, int N) {
        this.A = A;
        this.B = B;
        this.N = N;
        this.C = new int[N][N];
    }

    void print() {
        System.out.println("\nMatrix Addition\n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        print();
    }
}

class MatrixMultiplication extends Thread {
    int A[][];
    int B[][];
    int C[][];
    int N;

    MatrixMultiplication(int[][] A, int[][] B, int N) {
        this.A = A;
        this.B = B;
        this.N = N;
        this.C = new int[N][N];
    }

    void print() {
        System.out.println("\nMatrix Multiplication\n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = 0;
                for (int k = 0; k < N; k++) {
                    C[i][j] += A[i][j] * B[i][j];
                }
            }
        }

        print();
    }
}

public class Matrix_Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();


        int A[][] = new int[N][N];

        System.out.println("Enter Matrix A: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int B[][] = new int[N][N];

        System.out.println("Enter Matrix B: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        try {
            MatrixAddition C = new MatrixAddition(A, B, N);
            C.start();

            Thread.sleep(10000);

            MatrixMultiplication D = new MatrixMultiplication(A, B, N);
            D.start();
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}

