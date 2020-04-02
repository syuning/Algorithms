package Leetcode题库;

public class FindTheCelebrity {

    public static int findCelebrity(int n) {
        String[] people = new String [n];
        for (int i = 0; i < n; i++) {
            people[i] = "Y";
        }

        // 名人谁也不认识，删掉有熟人的人
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length; j++) {
                if (knows(i, j)) {
                    people[i] = "N";
                }
            }
        }

        // 剩下的是谁也不认识的人，判断其他人是否都认识他
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < people.length; j++) {
                if (!knows(i,j)) {
                    people[j] = "N";
                }
            }
        }

        for (int i = 0; i < people.length; i++) {
            if (people[i] == "Y") {
                System.out.println(people[0] + " " + people[1] + " " + people[2]);
                return i;
            }
        }
        System.out.println(people[0] + " " + people[1] + " " + people[2]);
        return -1;
    }

    public static boolean knows(int i, int j) {
       if (i==0 && j==2 || i==1 && j==2) {
           return true;
       }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findCelebrity(3));
    }

}
