package main.java.nowcoder.huawei;

import java.util.Scanner;

public class HJ22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currentLine = null;
        while(sc.hasNextLine()
//                && !(currentLine = sc.nextLine()).equals("0")
        ) {
            currentLine = sc.nextLine();
            int currentNumber = Integer.valueOf(currentLine);
            if (!currentLine.equals("0")) {
                int numOfSoda = 0;
                while(currentNumber >= 1) {
                    if (currentNumber >= 3) {
                        numOfSoda += currentNumber / 3;
                        currentNumber = currentNumber % 3 + currentNumber / 3;
//                        System.out.println("numOfSoda: " + numOfSoda);
//                        System.out.println("currentNumber: " + currentNumber);
                    } else if (currentNumber == 2) {
                        numOfSoda++;
                        currentNumber = 0;
//                        System.out.println("numOfSoda: " + numOfSoda);
                    } else {
                        currentNumber = 0;
                    }
                }
                System.out.println(numOfSoda);
            } else {
//                System.out.println("break");
                break;
            }
        }
        sc.close();;
    }
}
