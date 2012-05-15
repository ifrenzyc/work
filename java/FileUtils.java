import java.io.File;

public class FileUtils
{
    public static void main(String[] args)
    {
        for (int i=0; i<args.length; i++) 
        {
            if (args[i].equals("--help") || args[i].equals("-h"))
            {
                // TODO: echo help text
            } else if (args[i].equals("--count"))
            {
                String path = args[i+1];
                count(path);
            }
        }
    }

    public static void count(String dir)
    {
        File file = new File(dir);

        long total = count(file);
        System.out.println("That's " + total + " files in " + dir + ".");
    }

    private static long count(File file)
    {
		if (file == null)
	    {  
	        return 0L;  
	    }  
	    if (!file.isDirectory())
	    {  
	        return 1L;
	    }
	    
	    Long total = 0L;
	    File[] files = file.listFiles();
	    for (File f : files)
	    {
	    	if (f.isFile())
	    	{
	    		total += 1L;
	    	} else if (f.isDirectory())
	    	{
	    		total += count(f);
	    	}
	    }
	    
	    return total;
    }
}