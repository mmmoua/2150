import java.util.ArrayList;
import java.util.Scanner;
public class FileExist{
  public static void main(String[] args) throws FileNotFoundException {
   BusinessReadWrite test = new BusinessReadWrite();
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter the file name you would like to read " );
   String name = input.nextLine();

   try {
        ArrayList<String> fileLines = test.readFile(name);
    } catch (FileException ex) {
        System.out.println(ex.getMessage());
    }
    
    for(String line: fileLines) {
      System.out.println(line);
    }
    Collections.reverse(fileLines);
    for(String line: fileLines) {
      System.out.println(line);
    }
    
    System.out.println("Enter new file name ");
    String fileN = input.nextLine();
    try{
      test.writeFile(fileN, fileLines);
      
    }catch(FileException e){
      System.out.println(e.getMessage());
    }
      
  }
}
