package top.leeyunt.myblogApi.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class StrUtil {
	
	public static final SimpleDateFormat TIMESFORMAT= new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
	public static String Timesamp2String(Timestamp timesamp) {
		if(null!=timesamp) {
			try {
			return TIMESFORMAT.format(timesamp);
			}catch (Exception e) {
				System.err.println("Timesamp2String:"+e.toString());
			}
			return TIMESFORMAT.format(0);
		}
		else {
			return TIMESFORMAT.format(0);
		}
	}

}

