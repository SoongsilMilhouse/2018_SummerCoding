import java.util.*;

class Solution1 {
	
	public static void main(String[] args) { 
		int[] result1;
		int[] result2;
		int[] result3; 
		String[] words1 = {"tank","kick", "know", "wheel", "land", "dream" ,"mother", "robot", "tank"};
		String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};
		
		result1 = solution(3, words1);
		result2 = solution(5, words2);
		result3 = solution(2, words3);
		
		System.out.printf("%d %d\n", result1[0], result1[1]);
		System.out.printf("%d %d\n", result2[0], result2[1]);
		System.out.printf("%d %d\n", result3[0], result3[1]);
	}
	
	public static int[] solution(int n, String[] words) {
		char first_alphabet = 0;
        char last_alphabet = 0;
        char tmp_alphabet = 0;
		int[] answer = {0, 0};
        int turn = 0;
        int word_length = 0;
        int tmp_length = 0;
        String[] tmp_words = new String[words.length];  
       
        for (int i = 0; i < words.length; i++) {
        	word_length = words[i].length();
        	
        	if(i % n == 0) turn++;
        	
        	if(i == 0) {
        		tmp_length++;
        		first_alphabet = words[i].charAt(0);
        		last_alphabet = words[i].charAt(word_length-1);
        		tmp_alphabet = last_alphabet;
        		tmp_words[i] = words[i];
        		continue;
        	}
        	
        	for (int j = 0; j < tmp_length; j++) {
        		if (tmp_words[j].equals(words[i])) {
        			answer[0] = i % n + 1;
        			answer[1] = turn;
        			return answer;
        		}
        	}
    	
        	tmp_words[i] = words[i];
        	tmp_alphabet = last_alphabet;
        	first_alphabet = words[i].charAt(0);
        	last_alphabet = words[i].charAt(word_length-1);
        	
          	if(tmp_alphabet != first_alphabet) {
          		answer[0] = i % n + 1;
    			answer[1] = turn;
    			return answer;
        	}
        } 
        
        return answer;
    }
}
