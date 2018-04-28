import java.util.Arrays;

public class Solution3 {

	public static void main(String[] args) { 
		int d1[]  = {1, 3, 2, 5, 4};
		int d2[] = {2, 2, 3, 3};
		int d3[] = {1, 2, 2, 3, 4, 5};
		int budget1  = 9;
		int budget2 = 10;
		int budget3 = 10;
		
		System.out.println(solution(d1, budget1));
		System.out.println(solution(d2, budget2));
		System.out.println(solution(d3, budget3));
	}
	
	public static int solution(int[] d, int budget) {
        int result = 0;
        int sum = 0;
        
        for (int i = 0; i < d.length; i++) {
        	if (d[i] + sum == budget) {
        		result++;
        		break;
        	}
        	else if (d[i] + sum > budget) {
        		sum -= d[i-1];
        		sum += d[i];
        	}
        	else {
        		sum += d[i];
        		result++;
        	}
        }
        
        return result;
	}
}
