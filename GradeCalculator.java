
/*

Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59




 */


import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        System.out.println("enter marks obtained");

        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {

            System.out.println("you have obtained Grade A");

        } else if (marks >= 80 && marks <= 89) {

            System.out.println("you have obtained Grade B");

        } else if (marks >= 70 && marks <= 79) {

            System.out.println("you have obtained Grade C");

        } else if (marks >= 60 && marks <= 69) {

            System.out.println("you have obtained Grade D");

        } else {

            System.out.println("you have obtained grade F");

        }
    }
}
