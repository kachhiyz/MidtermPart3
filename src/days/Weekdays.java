package days;

/**
 * This class uses an enum to map input 
 * to the corresponding day of the week.
 *
 * @author sivagamasrinivasan
 */
public class Weekdays {

    
    public void getDayName(Days.WeekDays day) {
        switch (day) {
            case ONE:
                System.out.println("Monday");
                break;
            case TWO:
                System.out.println("Tuesday");
                break;
            case THREE:
                System.out.println("Wednesday");
                break;
            case FOUR:
                System.out.println("Thursday");
                break;
            case FIVE:
                System.out.println("Friday");
                break;
            case SIX:
                System.out.println("Saturday");
                break;
            case SEVEN:
                System.out.println("Sunday");
                break;
        }
    }
}
