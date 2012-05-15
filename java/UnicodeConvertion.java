import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UnicodeConvertion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String unicStr = sc.next();

        while (!"#".equals(unicStr)) {
            String string = unicode2String(unicStr);

            System.out.println("Unicode: " + unicStr);
            System.out.println(" String: " + string);

            unicStr = sc.next();
        }
    }

    /**
     * 将Unicode编码的字符串转换为原始信息的字符串
     *
     * @param unicode  Unicode编码的字符串
     *
     * @return 原始信息
     */
    public static String unicode2String(String unicode) {
        Matcher matcher = Pattern.compile("(\\\\u(\\p{XDigit}{4}))").matcher(unicode);
        String string = "";
        while (matcher.find()) {
            string += (char) Integer.parseInt(matcher.group(2), 16);
        }

        return string;
    }


    public static void main(String[] args)
    {
        // 中文“中”字的UTF-8编码,三个字节表示，用%分开
        // 这里模拟了Http请求的字节流
        String httpParamStream = "E4%B8%AD";

        // 模拟request.getParameter(String param)获取参数
        String[] httpParamArr = httpParamStream.split("%");
        byte[] bytes = new byte[httpParamArr.length];
        for (int i=0; i<httpParamArr.length; i++)
        {
            bytes[i] = (byte) Integer.parseInt(httpParamArr[i], 16);
        }

        String errStr = "";
        try
        {
            errStr = new String(bytes, "ISO-8859-1");
            System.out.println("乱码: " + errStr);
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();

            return ;
        }

        try
        {
            // 先按照字节流传送的编码字符串，再按照原来的编码重新生成
            String corrStr = new String(errStr.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println("正确编码：" + corrStr);
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
    }
}
