package Problem_2;
import java.util.*;
import java.util.stream.IntStream;


public class Merger {
    public List<Integer> mergeSorted(List<Integer> list1, List<Integer> list2){
        if (!isSorted(list1,list2)){
            throw new IllegalArgumentException("One of the list is not sorted");
        }
        if (hasDuplicates(list1,list2)){
            throw new IllegalArgumentException("One of the list is duplicated");
        }else {
            List<Integer> mergedList = new ArrayList<>(list1);
            mergedList.addAll(list2);
            Collections.sort(mergedList);
            return mergedList;
        }
    }
    public boolean isSorted(List<Integer> list1, List<Integer> list2) {
        List<Integer> list1Sorted = new ArrayList<Integer>(list1);
        List<Integer> list2Sorted = new ArrayList<Integer>(list2);
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list1Sorted) && list2.equals(list2Sorted);
    }
    public boolean hasDuplicates(List<Integer>list1, List<Integer> list2){
        Set<Integer> uniqueList = new HashSet<>();
        uniqueList.addAll(list1);
        uniqueList.addAll(list2);
        return (list1.size() + list2.size()) != uniqueList.size();
    }

    public static void main(String[] args) {
        Merger list = new Merger();
        System.out.println(list.mergeSorted(Arrays.asList(0, 6, 7, 8),Arrays.asList(1, 3, 5, 9, 10)));
    }
}
