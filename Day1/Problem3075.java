import java.util.Arrays;

public class Problem3075 {
     public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        
        long totalSum = 0;
        int n = happiness.length;
        
        for (int i = 0; i < k; i++) {
            int currentHappiness = Math.max(0, happiness[n - 1 - i] - i);

            if (currentHappiness == 0) break;
            totalSum += currentHappiness;
        }
        
        return totalSum;
    }

}
