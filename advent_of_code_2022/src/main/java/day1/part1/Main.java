package day1.part1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("inputs/day1.txt"));

        int calories = 0;
        int mostCalories = 0;
        String eachLine;
//        int topThreeSum;
//        int firstPos;
//        int secondPos;
//        int thirdPos;

        while ((eachLine = bufferedReader.readLine()) != null) {
            String cal = eachLine.trim();
            if (cal.isBlank()) {
                if (mostCalories < calories) {
                    mostCalories = calories;
                }
                calories = 0;
                continue;
            }
            calories += Integer.parseInt(cal);
        }
        if (calories > mostCalories) {
            System.out.println(calories);
        } else {
            System.out.println(mostCalories);
        }
    }
}
