import java.util.Scanner;

public class Assessment {
    public static void main(String[] args) {
        System.out.println(square(2));
        System.out.println(sum(3, 3));
        System.out.println(sum(3.3, 4.4));
        System.out.println(average());
    }
    static int square(int number){
        return number*number;
    }

    static int sum(int number1, int number2){
        return number1 + number2;
    }

    static double sum(double number1, double number2){
        return number1 + number2;
    }

    static double average(){
        int[] numbers = {1, 5, 6 , 8, 7};
        int numberAverage = 0;
        for(int number : numbers){
            numberAverage += number;
        }
        int average = numberAverage / 5;
        return average;
    }



}
