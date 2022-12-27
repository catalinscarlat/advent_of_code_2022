package day2.part1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<String, Integer> shape = new HashMap<>();
        shape.put("A", 1);
        shape.put("B", 2);
        shape.put("C", 3);
        shape.put("X", 1);
        shape.put("Y", 2);
        shape.put("Z", 3);

        BufferedReader bufferedReader = new BufferedReader(new FileReader("inputs/day2.txt"));

        int score = 0;
        String eachLine;
        while ((eachLine = bufferedReader.readLine()) != null) {
            String[] match = eachLine.trim().split(" ");
            if (match.length != 2) continue;

            if (shape.get(match[0]) == 3 && shape.get(match[1]) == 3) {
                score += 3;
                score += shape.get(match[1]);
            } else if (shape.get(match[0]) == 1 && shape.get(match[1]) == 2) {
                score += 6;
                score += shape.get(match[1]);
            } else if (shape.get(match[0]) == 2 && shape.get(match[1]) == 3) {
                score += 6;
                score += shape.get(match[1]);
            } else if (shape.get(match[0]) == 3 && shape.get(match[1]) == 1) {
                score += 6;
                score += shape.get(match[1]);
            } else if ((shape.get(match[0]) == 2 && shape.get(match[1]) == 2)) {
                score += 3;
                score += shape.get(match[1]);
            } else if ((shape.get(match[0]) == 1 && shape.get(match[1]) == 1)) {
                score += 3;
                score += shape.get(match[1]);
            } else if ((shape.get(match[0]) == 1 && shape.get(match[1]) == 3)) {
                score += 0;
                score += shape.get(match[1]);
            } else if ((shape.get(match[0]) == 2 && shape.get(match[1]) == 1)) {
                score += 0;
                score += shape.get(match[1]);
            } else if ((shape.get(match[0]) == 3 && shape.get(match[1]) == 2)) {
                score += 0;
                score += shape.get(match[1]);
            }
        }
        System.out.println(score);
    }
}
