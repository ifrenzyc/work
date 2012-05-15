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
     * ��Unicode������ַ���ת��Ϊԭʼ��Ϣ���ַ���
     *
     * @param unicode  Unicode������ַ���
     *
     * @return ԭʼ��Ϣ
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
        // ���ġ��С��ֵ�UTF-8����,�����ֽڱ�ʾ����%�ֿ�
        // ����ģ����Http������ֽ���
        String httpParamStream = "E4%B8%AD";

        // ģ��request.getParameter(String param)��ȡ����
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
            System.out.println("����: " + errStr);
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();

            return ;
        }

        try
        {
            // �Ȱ����ֽ������͵ı����ַ������ٰ���ԭ���ı�����������
            String corrStr = new String(errStr.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println("��ȷ���룺" + corrStr);
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
    }
}
