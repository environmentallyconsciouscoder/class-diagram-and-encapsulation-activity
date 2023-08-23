// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        char grade = 'B';
        char group = 5;

        boolean isGroupWithinRange = group >= 1 && group <= 5;
        boolean isGradeWithinRange = grade >= 'A' && grade <= 'F';

        if (isGradeWithinRange && isGroupWithinRange) {
            School student = new School("James", grade, group);
        }

    }
}