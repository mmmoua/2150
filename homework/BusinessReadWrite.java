import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class BusinessReadWrite{
  public ArrayList<String> readFile(String filename)
{
  ArrayList<String> name = new ArrayList<String>();
  try
  {
    BufferedReader read = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = read.readLine()) != null)
    {
      name.add(line);
    }
    read.close();
    return name;
  }
  catch (Exception e)
  {
    throw new FileException();
  }
  }
  public ArrayList<String> writeFile(String fileName, ArrayList<String> lines) throws FileMissingException
  {
    Collections.reverse(lines);
    try{
      BufferedWriter out = new BufferedWriter(new FileWriter(fileName)); 
    for(String line:lines){
      out.write(line);
    }
    
    out.close();
    }catch (Exception e)
    {
      throw new FileException();
    }
    return lines;
  }
}
