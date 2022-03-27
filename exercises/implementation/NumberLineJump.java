package exercises.implementation;

public class NumberLineJump {
	
	public static String kangaroo(int x1, int v1, int x2, int v2) {
	    // Write your code here
		int metters1 = x1;
	    int metters2 = x2;
	        
	    int limitIterator = 10000; //defined  max iteration allowed
	        
	    int quantityJump1 = 0;
	    int quantityJump2 = 0;
	        
	    int jump1 = v1;
	    int jump2 = v2;
	        
	    String result;
	    boolean samePositionAndMetters = false;
	        
	    while(!samePositionAndMetters) {
	            
	    	samePositionAndMetters = (metters1 == metters2) &&  (quantityJump1 == quantityJump2);
	            
	        if(limitIterator <= 0) {
	        	break;
	        }
	            
	        quantityJump1++;
	        metters1 += jump1;
	            
	        quantityJump2++;
	        metters2 += jump2;
	            
	        limitIterator--;

	     }
	        
	     if(samePositionAndMetters) {
	    	 result = "YES";
	     } else {
	         result = "NO";
	     }
	        
	     return result;
	}
}
