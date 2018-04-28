import java.util.*;

public class Solution2 {

	public static void main(String[] args) { 
		int A1[] = {5,1,3,7};
		int B1[] = {2,2,6,8};
		
		int A2[] = {2,2,2,2};
		int B2[] = {1,1,1,1};
		
		System.out.println(solution(A1,B1));
		System.out.println(solution(A2,B2));
	}
	
	public static int solution(int[] A,int[] B) {
        int result = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i < A.length; i++)
        	if(A[i] < B[i]) result++;
        
		return result;
	}
}
