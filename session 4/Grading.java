import java.util.ArrayList;
import java.util.Scanner;

public class Grading {

    public static ArrayList<Integer> enterGrades(int n) {
        // create an ArrayList of Integer to store grades
        ArrayList<Integer> grades = new ArrayList<>();
        // crearte a Scanner for user input
        Scanner input = new Scanner(System.in);
        // intialise the counter
        int index = 0;
        // while the number of input is below the specified number
        while (index < n) {
            // display to user some input information
            System.out.println("Enter grade: " + (index + 1) + " of " + n);
            // input the grade from keyboard
            int grade = input.nextInt();
            // add new grade to ArrayList
            grades.add(grade);
            // increase the counter
            index++;
        }
        // close the user input
        input.close();
        // return the grades ArrayList
        return grades;
    }

    public static void showAverageGrade(ArrayList<Integer> grades) {
        // initialise the sum
        int sum = 0;
        // add all the grades to the sum
        for (Integer grade : grades) {
            sum += grade;
        }
        // the average is the sum divided by the number of grades
        int average = sum / grades.size();
        // display the content of array and the average
        System.out.println("The average for the grades");
        for (Integer grade : grades) {
            System.out.print("\t" + grade + " ");
        }
        System.out.println("\nis " + average);
    }

    public static void showLowestGrade(ArrayList<Integer> grades) {
        // initialise the lowest value to the lowest it can be
        int lowest = Integer.MAX_VALUE;
        // if the grade is smaller than current lowest, then lowest is that grade
        for (Integer grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        // display the lowest value
        System.out.println("\nThe lowest grade is " + lowest);
    }

    public static void showHighestGrade(ArrayList<Integer> grades) {
        // initialise the higest value to the highest it can be
        int highest = Integer.MIN_VALUE;
        // if the grade is higher than current highest, then highest is that grade
        for (Integer grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        // display the highest value
        System.out.println("\nThe highest grade is " + highest);
    }

    public static ArrayList<Integer> getSmallerthanLimit(ArrayList<Integer> grades, int limit) {
        ArrayList<Integer> lowestGrades = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade < limit) {
                lowestGrades.add(grade);
            }
        }
        return lowestGrades;
    }

    public static ArrayList<Integer> getBiggerthanLimit(ArrayList<Integer> grades, int limit) {
        ArrayList<Integer> highestGrades = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade > limit) {
                highestGrades.add(grade);
            }
        }
        return highestGrades;
    }

    public static ArrayList<Integer> gradesInARange(ArrayList<Integer> grades, int min, int max) {
        ArrayList<Integer> newGradesList = new ArrayList<>();
        for (Integer grade : grades) {
            if ((grade < min) || (grade > max)) {
                newGradesList.add(grade);
            }
        }
        return newGradesList;
    }

    // import java.util.*;
    // import java.util.ArrayList;

    public static void main(String[] a) {

        int nbGrades = 5;
        ArrayList<Integer> grades = enterGrades(nbGrades);
        showAverageGrade(grades);
        showLowestGrade(grades);
        showHighestGrade(grades);
        int gradeLimit = 50;
        ArrayList<Integer> lowestGrades = getSmallerthanLimit(grades, gradeLimit);
        ArrayList<Integer> highestGrades = getBiggerthanLimit(grades, gradeLimit);
        System.out.println("\nGrade lower than " + gradeLimit);
        for (Integer grade : lowestGrades) {
            System.out.print(grade + " ");
        }
        System.out.println("\nGrade higher than " + gradeLimit);
        for (Integer grade : highestGrades) {
            System.out.print(grade + " ");
        }
        System.out.println();
        ArrayList<Integer> newGradesList = gradesInARange(grades, 20, 70);
        for (Integer grade : newGradesList) {
            System.out.print(grade + " ");
        }
    }

}
