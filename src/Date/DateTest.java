package Date;

import java.time.LocalDateTime;

public class DateTest {
    public static void main(String[] args) {
        System.out.println(getDate());
    }

    //HH:MM:SS
    public static String getDate(){
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minutes = now.getMinute();
        int seconds = now.getSecond();
        return hour + ":" + minutes + ":" + seconds;
    }
}
