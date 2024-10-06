import java.util.Date;
import java.util.Calendar;

class DateDemo{
    public static void main(){
        // Instantiate a date object 
        Date date = new Date();

        // Display time and date using to string 
        System.out.println(date);

        // Display number of millisecond since 8 pm and 9 minuite till 2nd october 2024
        long msec = date.getTime();
        System.out.println(msec);

    }
}

// import java.util.Date;
// import java.util.Calendar;

// class Datedemo {
//     public static void main(String[] args) {
//         // Instantiate a date object for the current time
//         Date currentDate = new Date();
        
//         // Display current time and date
//         System.out.println("Current Date and Time: " + currentDate);

//         // Set a specific time (2nd October 2024, 8:09 PM)
//         Calendar cal = Calendar.getInstance();
//         cal.set(2024, Calendar.OCTOBER, 2, 20, 9, 0);
//         Date targetDate = cal.getTime();

//         // Display the target date and time
//         System.out.println("Target Date and Time (2nd October 2024, 8:09 PM): " + targetDate);

//         // Calculate the difference in milliseconds
//         long millisecondsDiff = currentDate.getTime() - targetDate.getTime();
//         System.out.println("Milliseconds since 8:09 PM, 2nd October 2024: " + millisecondsDiff);
//     }
// }
