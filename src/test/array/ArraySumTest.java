package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest {

    @Test
    public void test(){
        ArraySum arraySum = new ArraySum();
        int[] nums = {1,2,3,4,5};
        int actualSum = arraySum.getSum(nums);
        int expectedSum = 15;
        assertEquals(expectedSum,actualSum);
    }
@Test
    public void test2(){
        ArraySum arraySum = new ArraySum();
        int[] num = {17,19,43,3,7};
        int actualMax = arraySum.getMaximum(num);
        int expectedMax = 43;
        assertEquals(expectedMax,actualMax);


    }


}