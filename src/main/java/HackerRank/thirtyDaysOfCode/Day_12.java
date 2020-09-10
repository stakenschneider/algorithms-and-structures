package hackerRank.thirtyDaysOfCode;

import java.util.*;

// Inheritance
class Person_1 {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person_1(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }

}

class Student extends Person_1 {
    private int[] testScores;

    /**
     * Class Constructor
     *
     * @param firstName - A string denoting the Person's first name.
     * @param lastName  - A string denoting the Person's last name.
     * @param id        - An integer denoting the Person's ID number.
     * @param scores    - An array of integers denoting the Person's test scores.
     */
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    /**
     * Method Name: calculate
     *
     * @return A character denoting the grade.
     */
    char calculate() {
        double average = Arrays.stream(testScores).average().orElse(Double.NaN);
        if (average >= 90 && average <= 100) {
            return 'O';
        }
        if (average >= 80 && average < 90) {
            return 'E';
        }
        if (average >= 70 && average < 80) {
            return 'A';
        }
        if (average >= 55 && average < 70) {
            return 'P';
        }
        if (average >= 40 && average < 55) {
            return 'D';
        }
        return 'T';
    }
}

class Day_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}