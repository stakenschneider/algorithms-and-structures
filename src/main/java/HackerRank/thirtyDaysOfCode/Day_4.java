package hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

// Class vs. Instance
class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge >= 0) {
            age = initialAge;
        } else {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void amIOld() {
        String str;
        if (age < 13)
            str = "You are young.";
        else if (age < 18)
            str = "You are a teenager.";
        else
            str = "You are old.";
        System.out.println(str);
    }

    public void yearPasses() {
        age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
