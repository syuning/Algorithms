package main.java.string;

public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        int numOfJew = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0 ; j < J.length(); j++) {
                if (J.charAt(j) == S.charAt(i)) {
                    numOfJew++;
                }
            }
        }
        return numOfJew;
    }
}
