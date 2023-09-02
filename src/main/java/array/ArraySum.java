package array;

public class ArraySum {
    public int getSum(int num[]){
        int sum = 0;
        for(int n : num){
            sum += n;
        }

        return sum;
    }

    public int getMaximum(int num[]){
        int i;
        int max = num[0];
        for(i = 0; i < num.length; i++)
            if(num[i] > max)
                max = num[i];

        return max;
    }

}
