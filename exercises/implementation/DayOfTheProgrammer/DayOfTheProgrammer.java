package exercises.implementation.DayOfTheProgrammer;

public class DayOfTheProgrammer {

	public DayOfTheProgrammer() {
		// TODO Auto-generated constructor stub
	}

	public static String dayOfProgrammer(int year) {
	    // Write your code here
	        int programmerDay = 256;
	        Integer[] daysOfMonthGregorian = {31, 28, 31, 30, 31, 30, 31, 31};
	        Integer[] daysOfMonthJulian = {31, 29, 31, 30, 31, 30, 31, 31};
	        
	        Integer[] representTypeCalender;
	        
	        int fromCalenderTransition = 1917;
	        int exactlyYearTransition = 1918;
	        
	        int sum = 0;
	        int dayResult;
	        
	        
	        if(year >= fromCalenderTransition) {
	            representTypeCalender = daysOfMonthGregorian;
	            
	            if(isLeapYear(year, "gregorian")) {
	                representTypeCalender[1] = 29;
	            } else {
	                representTypeCalender[1] = 28;
	            }
	        
	            if(year == exactlyYearTransition) representTypeCalender[1] = 15;
	            
	        } else {
	            representTypeCalender = daysOfMonthJulian;
	            
	            
	            if(isLeapYear(year, "julian")) {
	                representTypeCalender[1] = 29;
	            } else {
	                representTypeCalender[1] = 28;
	            }
	        }
	        
	         
	        for(Integer days : representTypeCalender) {
	            sum += days;
	        }
	        
	        dayResult = programmerDay - sum;
	        
	        return "" + dayResult + "." + "09" + "." + year;
	        

	    }
	    
	    private static boolean isLeapYear(int year, String type) {
	        int moduleFactor = 4; // determine if the year is a leap
	        int moduleFactor2 = 100; // determine if the year is a leap
	        int moduleFactor3 = 400; // determine if the year is a leap
	        
	        boolean firstCondition = year % moduleFactor == 0;
	        boolean secondCondition = year % moduleFactor2 != 0;
	        boolean thirdCondition = year % moduleFactor3 == 0; 
	        
	        switch(type) {
	            case "gregorian":
	                 if(thirdCondition || (firstCondition && secondCondition)) {
	                   return true;  
	                 } 
	                 break;
	            case "julian":
	                 if(firstCondition) return true;
	                 break;
	        }
	       
	        return false;
	    }
}
