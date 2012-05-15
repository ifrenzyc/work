import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DateUtils
{
	public static final String YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";
	public static final String YYYYMMDD = "yyyy-MM-dd";


	public static String formatDate(Date date, String format)
	{
		return formatDateByFormat(date, format);
	}


	/**
	 * 验证时间是否落在系统配置的用户允许登录的时间段内
	 * 
	 * @param   dateValue  时间字符串
	 * 
	 * @return
	 */
	public static String parseDate(String dateValue)
	{
	}


	public static String formatDate(Date date)
	{
	}


	public static boolean isToday(String checkDate)
	{
		Date date = stringToDate(checkDate, "yyyy-MM-dd");
		formatDate(date, "yyyy-MM-dd");
		return formatDate(new Date(), "yyyy-MM-dd").equals(formatDate(date, "yyyy-MM-dd"));
	}


	private static String formatDateByFormat(Date date, String format)
	{
		String ret = "";
		if (date != null)
		{
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			ret = sdf.format(date);
		}
		return ret;
	}


	public static Date string2Date(String str, String format)
	{
		if (str != null)
		{
			SimpleDateFormat dateFormat = new SimpleDateFormat(format);
			try
			{
				return dateFormat.parse(str);
			} catch(ParseException e)
			{
				return null;
			}
		} else
		{
			return null;
		}
	}


	public static void main(String[] args)
	{
		List<String> ret = new ArrayList<String>();

		Calendar calendar = Calendar.getInstance(); 
		Date startDate = string2Date("2011-02-19 13:12:06", YYYYMMDDHHMMSS);
		calendar.setTime(startDate); 
		calendar.set(Calendar.HOUR, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);

		Date endDate = string2Date("2011-3-05 23:59:59", YYYYMMDDHHMMSS);  //结束时间
		while (calendar.getTime().getTime() <= endDate.getTime())
		{
			Date d = calendar.getTime();
			String day = formatDate(d, YYYYMMDD);
			ret.add(day + "（上午）");
			ret.add(day + "（下午）");

			calendar.roll(Calendar.DAY_OF_YEAR, 1);  //明天
		}

		for (String str : ret)
		{
			System.out.println(str);
		}
	}
}