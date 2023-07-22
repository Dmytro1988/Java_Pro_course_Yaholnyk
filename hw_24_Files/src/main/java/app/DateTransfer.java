package app;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTransfer {

    public static String convert(){
        String pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date(System.currentTimeMillis()));
    }


}
