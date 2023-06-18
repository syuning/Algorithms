package main.java.nowcoder.huawei;
import java.io.*;
public class HJ76 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int m = Integer.parseInt(s);
            // m³ = m x m² = m 个 m² 相加
            String result = "";
            for (int i = 0; i < m; i++) {
                int current = m * m -(m - 2*i - 1);
                result += current;
                if (i < m-1) {
                    result += "+";
                }
            }
            System.out.println(result);
        }
    }
}
