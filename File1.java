import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class File1
{
public static void main(String[] args)
{
try {
File1 file=new File1("Oneone.txt");
FileReader fr=new FileReader(file);
}
catch(FileNotFoundException e)
{
System.out.println("File does not exist");
}
}
}