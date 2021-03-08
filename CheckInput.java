import java.util.Scanner;

class LowerCase extends Thread {
    char ch;

    LowerCase(char ch) {
        this.ch = ch;
    }

    @Override
    public void run() {
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is LowerCase.");
        } else {
            System.out.println(ch + " is not LowerCase.");
        }
    }
}

class UpperCase extends Thread {
    char ch;

    UpperCase(char ch) {
        this.ch = ch;
    }

    @Override
    public void run() {
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is UpperCase.");
        } else {
            System.out.println(ch + " is not UpperCase.");
        }
    }
}

class Digit extends Thread {
    char ch;

    Digit(char ch) {
        this.ch = ch;
    }

    @Override
    public void run() {
        if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is Digit.");
        } else {
            System.out.println(ch + " is not Digit.");
        }
    }
}

class OtherCharacter extends Thread {
    char ch;

    OtherCharacter(char ch) {
        this.ch = ch;
    }

    @Override
    public void run() {
        if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
            System.out.println(ch + " is OtherCharacter.");
        } else {
            System.out.println(ch + " is OtherCharacter.");
        }
    }
}


public class CheckInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character - ");
        char ch = sc.next().charAt(0);

        new LowerCase(ch).start();
        new UpperCase(ch).start();
        new Digit(ch).start();
        new OtherCharacter(ch).start();
    }
}
