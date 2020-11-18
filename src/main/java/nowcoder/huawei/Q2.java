package main.java.nowcoder.huawei;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//        while (sc.hasNextLine()) {
            String [] products = sc.nextLine().split(",");
            int budget = Integer.parseInt(sc.nextLine());

//            for (String s: products) {
//                System.out.println(s + " ");
//            }
//            System.out.println("budget: " + budget);

            if (products.length > 2 && products.length < 100) {
                int sumPrice = -1;
                for (int i = 0; i < products.length; i++) {
                    for (int j = 0; j < products.length && j!=i; j++) {
                        for (int k = 0; k < products.length && k!=i && k!=j; k++) {
                            int priceA = Integer.parseInt(products[i]);
                            int priceB = Integer.parseInt(products[j]);
                            int priceC = Integer.parseInt(products[k]);
                            if ((priceA + priceB + priceC) > sumPrice && (priceA + priceB + priceC) < budget) {
                                sumPrice = priceA + priceB + priceC;
                            }
                        }
                    }
                }
                System.out.println(sumPrice);
            } else {
                System.out.println(-1);
            }
//        }
    }
}
