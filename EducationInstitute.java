import java.util.Scanner;

class Staff {
    String name;
    int code;

    Staff(String staffname, int staffcode) {
        name = staffname;
        code = staffcode;
    }

    void printStaff() {
        System.out.println("Name = " + name);
        System.out.println("Code = " + code);
    }
}

class Officer extends Staff {
    int grade;

    Officer(String name, int code, int officergrade) {
        super(name, code);
        grade = officergrade;
    }

    void printOfficer() {
        System.out.println("Name = " + name);
        System.out.println("Code = " + code);
        System.out.println("Grade = " + grade);
    }
}

class Teacher extends Staff {
    String subject;

    Teacher(String name, int code, String teachersubject) {
        super(name, code);
        subject = teachersubject;
    }

    void printTeacher() {
        System.out.println("Name = " + name);
        System.out.println("Code = " + code);
        System.out.println("Subject = " + subject);
    }
}

class Typist extends Staff {
    int speed;

    Typist(String name, int code, int typistspeed) {
        super(name, code);
        speed = typistspeed;
    }

    void printTypist() {
        System.out.println("Name = " + name);
        System.out.println("Code = " + code);
        System.out.println("Speed = " + speed);
    }
}

class CasualTypist extends Typist {
    int dailyWage;

    CasualTypist(String name, int code, int speed, int dailyWage) {
        super(name, code, speed);
        this.dailyWage = dailyWage;
    }

    void printCasualTypist() {
        System.out.println("Name = " + name);
        System.out.println("Code = " + code);
        System.out.println("Speed = " + speed);
        System.out.println("Daily Wage = " + dailyWage);
    }
}

class RegularTypist extends Typist {
    String remoration;

    RegularTypist(String name, int code, int speed, String remoration) {
        super(name, code, speed);
        this.remoration = remoration;
    }

    void printRegularTypist() {
        System.out.println("Name = " + name);
        System.out.println("Code = " + code);
        System.out.println("Speed = " + speed);
        System.out.println("Remoration = " + remoration);
    }
}


public class EducationInstitute {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name - ");
        String name = sc.next();

        System.out.print("Enter Code - ");
        int code = sc.nextInt();

        System.out.print("Enter grade - ");
        int grade = sc.nextInt();

        // Officer Class
        System.out.println("Officer");
        Officer[] off = new Officer[1];
        off[0] = new Officer(name, code, grade);
        off[0].printOfficer();
        System.out.println();

        // taking input for Teacher Class
        System.out.print("Give input for teacher ");
        System.out.print("Enter Subject - ");
        String subject = sc.next();

        System.out.println("Teacher");
        Teacher[] tc = new Teacher[1];
        tc[0] = new Teacher(name, code, subject);
        tc[0].printTeacher();
        System.out.println();

        // taking input for typist Class
        System.out.print("Give input for typist ");
        System.out.print("Enter Speed - ");
        int speed = sc.nextInt();

        // Typist Class
        System.out.println("Typist");
        Typist[] ty = new Typist[1];
        ty[0] = new Typist(name, code, speed);
        ty[0].printTypist();
        System.out.println();


        // taking input for casualtypist Class
        System.out.print("Give input for casualtypist ");
        System.out.print("Enter Daily Wage - ");
        int dailyWage = sc.nextInt();

        // CasualTypist Class
        System.out.println("CasualTypist");
        CasualTypist[] cty = new CasualTypist[1];
        cty[0] = new CasualTypist(name, code, speed, dailyWage);
        cty[0].printCasualTypist();
        System.out.println();


        System.out.print("Enter Remoration - ");
        String remoration = sc.next();

        // RegularTypist Class
        System.out.println("RegularTypist");
        RegularTypist[] rty = new RegularTypist[1];
        rty[0] = new RegularTypist(name, code, speed, remoration);
        rty[0].printRegularTypist();
        System.out.println();
    }
}