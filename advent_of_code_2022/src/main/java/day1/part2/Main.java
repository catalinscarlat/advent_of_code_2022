package day1.part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("inputs/day1.txt"));

        int calories = 0;
        int mostCalories = 0;
        String eachLine;
        int topThreeSum = 0;
        int firstPos = 0;
        int secondPos = 0;
        int thirdPos = 0;

        while ((eachLine = bufferedReader.readLine()) != null) {
            String cal = eachLine.trim();
            if (cal.isBlank()) {
                if (firstPos <= calories) {
                    int temp1 = firstPos;
                    int temp2 = secondPos;
                    firstPos = calories;
                    secondPos = temp1;
                    thirdPos = temp2;
                } else if (calories >= secondPos && calories < firstPos) {
                    int temp1 = secondPos;
                    secondPos = calories;
                    thirdPos = temp1;
                } else if (calories >= thirdPos && calories < secondPos) {
                    thirdPos = calories;
                }
                calories = 0;
                continue;
            }
            calories += Integer.parseInt(cal);
        }
        if (calories > thirdPos){
            thirdPos = calories;
    }
        topThreeSum = firstPos + secondPos + thirdPos;
        System.out.println("Total calories: " + topThreeSum);
    }
}
