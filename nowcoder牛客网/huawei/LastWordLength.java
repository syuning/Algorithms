package nowcoder牛客网.huawei;

import java.util.Scanner;

public class LastWordLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = "";
        // while(input.hasNextLine()) {
            s = input.nextLine();
            System.out.println(s.length()-1-s.lastIndexOf(" "));
        // }
        input.close();
    }
}