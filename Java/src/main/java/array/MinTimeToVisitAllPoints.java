package main.java.array;

public class MinTimeToVisitAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int x = points[0][0];
        int y = points[0][1];
        int distance = 0;
        for (int i = 1; i < points.length; i++) {
                while (x < points[i][0] || y < points[i][1]) {
                    if (x < points[i][0] && y < points[i][1]) {
                        distance++;
                        x++;
                        y++;
                        System.out.println("distance = " + distance + ", x: " + x +", y:" + y);
                    } else if (x < points[i][0] && y >= points[i][1]) {
                        distance++;
                        x++;
                        System.out.println("distance = " + distance + ", x: " + x +", y:" + y);
                    } else if (x >= points[i][0] && y < points[i][1]) {
                        distance++;
                        y++;
                        System.out.println("distance = " + distance + ", x: " + x +", y:" + y);
                    }
                }
                while (x > points[i][0] || y > points[i][1]) {
                     if(x > points[i][0] && y > points[i][1]) {
                        distance++;
                        x--;
                        y--;
                        System.out.println("distance = " + distance + ", x: " + x +", y:" + y);
                    } else if (x > points[i][0] && y <= points[i][1]) {
                        distance++;
                        x--;
                        System.out.println("distance = " + distance + ", x: " + x +", y:" + y);
                    } else if (x <= points[i][0] && y > points[i][1]) {
                        distance++;
                        y--;
                        System.out.println("distance = " + distance + ", x: " + x +", y:" + y);
                    }
                }
        }
        return distance;
    }
}
