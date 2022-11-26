package exercises.implementation.BetweenTwoSets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BetweenTwoSets {

	public BetweenTwoSets() {
		// TODO Auto-generated constructor stub
	}
	
	public static int getTotalX(List<Integer> a, List<Integer> b) {
	    // Write your code here
	        Integer firstElement = a.get(0);
	        Integer lastElement = b.get(b.size() - 1);
	    
	        Set<Integer> finalResultA = new HashSet<>();
	        Set<Integer> finalResultB = new HashSet<>();
	        
	        Integer counterA = 0;
	        Integer counterB = 0;

	        while(!(firstElement > lastElement)) {
	            for(Integer value : a) {
	                if(firstElement % value == 0) {
	                    counterA++;
	                } else {
	                    counterA = 0;
	                }
	                       
	            }
	            
	            if(counterA == a.size()) {
	                finalResultA.add(firstElement);
	            }
	            
	            for(Integer value : b) {
	                if(value % firstElement == 0) {
	                    counterB++;
	                } else {
	                    counterB = 0;
	                }
	            }
	            
	            if(counterB == b.size()) {
	                finalResultB.add(firstElement);
	            }
	            
	                    
	            firstElement += 1;
	            counterA = 0;
	            counterB = 0;
	            
	        }

	        finalResultA.retainAll(finalResultB);
	        
	        return finalResultA.size();
	    
	    }

}
