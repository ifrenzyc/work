public class AutoboxingTest
{
    
    public static void main(String[] args)
    {
        testNoBoxing();
        testAutoboxing();
    }

    public static void testAutoboxing()
    {
        Long startTime = System.currentTimeMillis();
        Long sum = 0L;
        for (long i=0; i<Integer.MAX_VALUE; i++) 
        {
            sum += i;
        }
        Long endTime = System.currentTimeMillis();

        System.out.println("[TEST] Autoboxing.................");
        System.out.println(sum);
        System.out.println("Using time: " + (endTime-startTime));
    }

    public static void testNoBoxing()
    {
        Long startTime = System.currentTimeMillis();
        long sum = 0L;
        for (long i=0L; i<Integer.MAX_VALUE; i++) 
        {
            sum += i;
        }
        Long endTime = System.currentTimeMillis();

        System.out.println("[TEST] NoAutoboxing...............");
        System.out.println(sum);
        System.out.println("Using time: " + (endTime-startTime));

    }
}