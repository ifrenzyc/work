import java.io.UnsupportedEncodingException;


public class Text2HexStr
{
	public static void main(String[] args) throws UnsupportedEncodingException
	{
		String ret = "";
		byte[] b = "ÀèÃ÷".getBytes("gb2312");
		for (int i=0; i<b.length; i++)
		{
			String hex = Integer.toHexString(b[i] & 0xFF);
			if (hex.length() == 1)
			{
				hex = '0' + hex;
			}
			ret += hex.toUpperCase();
		}

		System.out.print(ret);
	}
}
