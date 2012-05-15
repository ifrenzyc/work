public class StringBuilderTest
{
    private static final int ITEMS = 100000;

    public static void useConcatenateOperator()
    {
        long startTime = System.nanoTime();

        String val = new String();
        for (int i=0; i<ITEMS; i++)
        {
            val += getItem(i);
        }

        long endTime = System.nanoTime();

        System.out.println("[TEST]...useConcatenateOperator...");
        System.out.println("Use: " + (endTime-startTime));
    } 

    public static void useStringBuffer()
    {
        long startTime = System.nanoTime();

        StringBuffer sb = new StringBuffer("");
        for (int i=0; i<ITEMS; i++)
        {
            sb.append(getItem(i));
        }

        long endTime = System.nanoTime();

        System.out.println("[TEST]...useStringBuffer...");
        System.out.println("Use: " + (endTime-startTime));
    }

    public static void useStringBuilder()
    {
        long startTime = System.nanoTime();

        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<ITEMS; i++)
        {
            sb.append(getItem(i));
        }

        long endTime = System.nanoTime();

        System.out.println("[TEST]...useStringBuilder...");
        System.out.println("Use: " + (endTime-startTime));
    }

    private static String getItem(int i)
    {
        return "sdfsdfweqrdvadssww" + i;
    }

    public static void main(String[] args)
    {
        // useConcatenateOperator();
        useStringBuffer();
        useStringBuilder();
    }
}
