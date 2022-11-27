package exercises.implementation.TheBirthdayBar;

import java.util.List;

public class TheBirthdayBar {

	public TheBirthdayBar() {
		// TODO Auto-generated constructor stub
	}
	
	public static int birthday(List<Integer> s, int d, int m) {
	    // Write your code here
	        int counterMatches = 0;
	        
	        if(s.size() < m) {
	            return 0;
	        }
	        
	        if(s.size() < 2) {
	            if(s.get(0) == d) {
	                return 1;
	            }
	        }
	        
	        for(int i = 0; i < s.size(); i++) {
	            int result = sumNumbersByDecreaseIndex(i, (i + m), s);
	            
	            if(result == d) counterMatches++;     
	        }

	        return counterMatches;
	    }
	    
	    private static int sumNumbersByDecreaseIndex(int indexI, int indexF, List<Integer> s) {
	        int sum = 0;
	        if(indexF > s.size()) return 0;
	        
	        while(true) {
	            if(indexF == indexI) break;
	            
	            sum += s.get(indexF - 1);
	            
	            indexF--;
	        }
	        
	        return sum;
	    }


}
