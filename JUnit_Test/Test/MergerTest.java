import Problem_2.Merger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergerTest {
    public Merger merger;
    List<Integer> list1;
    List<Integer> list2;

    @BeforeEach
    void setUp(){
        merger = new Merger();
        list1 = Arrays.asList(1, 3, 5, 7, 9);
        list2 = Arrays.asList(2, 4, 6, 8);
    }

    @Test
    void mergeSorted() {
        assertArrayEquals(new Object[]{1,2,3,4,5,6,7,8,9},merger.mergeSorted(list1,list2).toArray());
    }

    @Test
    void isSorted() {
    }

    @Test
    void hasDuplicates() {
    }
}