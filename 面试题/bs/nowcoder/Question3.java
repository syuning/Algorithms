package 面试题.bs.nowcoder;

import java.util.ArrayList;

public class Question3 {
    public static ArrayList<Integer> bubbleSort (ArrayList<Integer> array) {
        ArrayList<Integer> result = new ArrayList<>();

        int j = 0;
        int currentMin;
        while (j < array.size()) {
            currentMin = array.get(j);
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) < currentMin) {
                    currentMin = array.get(i);
                }
            }
            result.add(currentMin);
            array.remove(currentMin);
            j++;
        }

        return result;
    }

    public static ArrayList<Integer> quickSort (ArrayList<Integer> array) {
        ArrayList<Integer> result = new ArrayList<>();
        return result;
    }

    public static void main (String[] args) {
//        ArrayList<Integer> array = new ArrayList<>();
//        array.add(2);
//        array.add(6);
//        array.add(1);
//        array.add(3);
//        array.add(5);
//        array.add(8);
//        System.out.println(bubbleSort(array));
//        Scanner input = new Scanner(System.in);
//        int n = Integer.parseInt(input.next());
//        ArrayList<Integer> inputArray = new ArrayList();
//        for (int i = 0; i < n; i ++) {
//            int current = Integer.parseInt(input.next());
//            if (inputArray.contains(current)) {
//                break;
//            } else {
//                inputArray.add(current);
//            }
//        }
//        LinkedList<Integer> OutputArray = new LinkedList<>();
//        for (int i = 0; i < inputArray.size(); i++) {
//            OutputArray.add(1000);
//        }
//        int min = inputArray.get(0); //取第一个数为最小值
//        for (int i = 1; i < inputArray.size(); i++) {
//            if (inputArray.get(i) < min) {
//                //若当前数小于min，则将原min加入数组，并取当前值为新的min
//                OutputArray.set(i, min);
//                min = inputArray.get(i);
//            } else {
//                //若当前数大于min，则将当前值加入数组
//                OutputArray.set(i, inputArray.get(i));
//            }
//        }
//        System.out.println(OutputArray);
//        System.out.println(inputArray);
        int i = 222;
        String s = String.valueOf(i);
        System.out.println(s);
    }
}
