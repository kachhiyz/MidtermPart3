package days;

import java.util.Scanner;

/**This program takes input from the user
 * and prints the corresponding day of the week
 * by using enums instead of Strings for input.
 * This ensures valid day names are used.
 *
 * @author sivagamasrinivasan

 */
public class Days {

    
    enum WeekDays {
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN
    }

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a day number (ONE, TWO, THREE, etc.):");

        
        String userInput = scanner.next().toUpperCase();
        WeekDays selectedDay = WeekDays.valueOf(userInput);

        
        Weekdays weekdaysInstance = new Weekdays();
        weekdaysInstance.getDayName(selectedDay);
    }
}
