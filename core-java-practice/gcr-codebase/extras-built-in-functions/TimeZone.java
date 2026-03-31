
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone{
    public static void main(String args[]){
        ZonedDateTime gmtTiming=ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTiming=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTiming=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));


        System.out.println("current timing in different zones");
        System.out.println("GMT "+gmtTiming);
        System.out.println("IST "+istTiming);
        System.out.println("PST "+pstTiming);


    }
}
