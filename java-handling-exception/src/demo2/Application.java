package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application
{
    public static void main(String[] args)
    {
        File file = new File("test.txt");

        try
        {
            FileReader fr = new FileReader(file);

            // this will not be ran if an exceptions is thrown
            System.out.println("Continuing .....");
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File not found : " + file.toString());
        }
    }
}
