class check {
    void numOperation(int value) {
        int numround = Math.round(value);

        System.out.println(numround);
    }

    void numOperation(double value) {
        double numceil =  Math.ceil(value);

        System.out.println(numceil);
    }

    void numOperation(float value) {
        float numFloat = (float) Math.floor(value);

        System.out.println(numFloat);
    }
}

public class Operations {
    public static void main(String[] args) {
        check num1 = new check();

        num1.numOperation(10);
        num1.numOperation(100.100F);
        num1.numOperation(100.100);
    }
}






