package Unit3.db;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class File1 {
    public static void main(String[] args) throws IOException {
        try{
            FileReader fr=new FileReader("C:\\Users\\Aniruddha Singh\\IdeaProjects\\java-44\\oops\\src\\Unit3\\db");
            Properties p=new Properties();
            p.load(fr);
            System.out.println(p.getProperty("user"));
            System.out.println(p.getProperty("admin"));
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
