import java.util.LinkedList;

// 第一题
public class Sort {
    public LinkedList<Integer> sort (LinkedList<Integer> inputList) {
        int max = inputList.getLast(); 
        int initLength = inputList.size();
        LinkedList<Integer> resultList = new LinkedList<Integer>();
        for (int i = 0; i < initLength; i++){
            if(inputList.get(i) > max) {
                inputList.remove(inputList.get(i)); // remove it from the original position first
                inputList.add(inputList.get(i)); // then apend it to the end of inputList
                max = inputList.get(i);
            }
        }
        return resultList;
    }
}