/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int totalSundaysOnFirst = 0;
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
        int debugDaysCounter = 0;
        while (year <= 1999) {
            advance();
            debugDaysCounter++;
            if (debugDaysCounter == 100000) {
                break;
            }
        }
		System.out.println("During the 20th century, " +totalSundaysOnFirst+" Sundays fell on the first day of the month");
    }

	 	//// Write the necessary ending code here

	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		String whereIsSunday ="Sunday"; // #feedback - this variable is not needed, you can have this string directly in the println function.
		if (dayOfWeek == 0 || dayOfWeek == 7) {
			System.out.println(dayOfMonth +"/"+month +"/"+ year+ " "+ whereIsSunday);
			if (dayOfMonth==1){
			totalSundaysOnFirst++;
		}
		} else{
			System.out.println(dayOfMonth +"/"+month+"/"+ year);
		}

		dayOfMonth++;
		dayOfWeek = (dayOfWeek + 2) % 7;

		if (dayOfMonth > nDaysInMonth(month, year)) {
			dayOfMonth = 1;
			month++;

			if (month > 12) {
				month = 1;
				year++;
			}
		}
		
	}

		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		switch (month) {
			case 1:
				return 31;
		
			case 2:
				if(isLeapYear(year))
				return 29;
				return 28;
			case 3:
				return 31;
				 
			case 4:
				return 30;

			case 5:
				return 31;
			case 6:
				return 30;
			case 7:
				return 31;
			
			case 8:
				return 31;

			case 9:
				return 30;
			case 10:
				return 31;

			case 11:
				return 30;
			case 12:
				return 31;			
		}
		return 0;
	}
}

