package main.java.nowcoder.huawei;

import java.io.*;

public class HJ73 {

    // 一月大 二月平 三月大 四月小 五月大 六月小 七月大 八月大 九月小 十月大 十一月小 十二月大

    // ①、普通年能被4整除且不能被100整除的为闰年
    // ②、世纪年能被400整除的是闰年

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int outDay = 0;
        while ((s = br.readLine()) != null) {
            String [] dates = s.split(" ");
            int year = Integer.parseInt(dates[0]);
            int month = Integer.parseInt(dates[1]);
            int day = Integer.parseInt(dates[2]);
            for (int i = 1; i < month; i++) {
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    outDay += 31;
                } else if ( i == 4 || i == 6 || i == 9 || i == 11) {
                    outDay += 30;
                } else if (i == 2) {
                    if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
                        outDay += 29;
                    } else {
                        outDay += 28;
                    }
                }
            }
            outDay += day;
            System.out.println(outDay);
        }
    }

}
