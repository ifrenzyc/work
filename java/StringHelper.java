import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper
{
	private static boolean isNumeric(String str)
	{
		if (StringHelper.isBlank(str))
		{
			return false;
		}
		
        boolean flag = false;
        try
        {
            new BigDecimal(str);
            flag = true;
        }
        catch (NumberFormatException ex)
        {
            flag = false;
        }

        return flag;
	}    

    public static boolean isBlank(String str)
    {
        int strLen;
        if(str == null || (strLen = str.length()) == 0)
            return true;
        for(int i = 0; i < strLen; i++)
            if(!Character.isWhitespace(str.charAt(i)))
                return false;

        return true;
    }    

    public static void main(String[] args)
    {
        String str1 = "test323543";
        String str2 = "testtest";
        String str3 = "3223Test";
        String str4 = "35435143";

        System.out.println("str1: " + isNumeric(str1));
        System.out.println("str2: " + isNumeric(str2));
        System.out.println("str3: " + isNumeric(str3));
        System.out.println("str4: " + isNumeric(str4));
    }
}
