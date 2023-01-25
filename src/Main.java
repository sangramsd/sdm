import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.FileReadWriteException;
import exceptions.InvalidInputException;
import faculty.FacultyManagement;
import student.StudentManagement;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Welcome to University Management System \n");
        System.out.println("1. Faculty Management");
        System.out.println("2. Student Management");
        System.out.print("\nSelect Option: ");

        try {
            int managementOption = sc.nextInt();

            switch (managementOption) {
                case 1:
                    FacultyManagement.runFacultyOperation();
                    break;
                case 2:
                    StudentManagement.runStudentOperation();
                    break;
                default:
                    System.out.println("Unknown Operation");
            }

        } catch (InputMismatchException error) {

            System.out.println("Error: Invalid input given");

        } catch (InvalidInputException error) {

            System.out.println("Error: " + error.toString());

        } catch (FileReadWriteException error) {

            System.out.println("Error: " + error.toString());

        } catch (Exception error) {

            System.out.println("Error: " + error.toString());

        } finally {
            sc.close();
        }
    }
}