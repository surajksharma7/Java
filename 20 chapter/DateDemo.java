import java.util.Date;

class program_01{
    public static void main(){
        // Instantiate a date object 
        Date date = new Date();

        // Display time and date using to string 
        System.out.println(date);

        // Display number of millisecond since 8 pm and 21 minuite till 1 oct 2024 
        long msec = date.getTime();
        System.out.println(msec);

    }
}