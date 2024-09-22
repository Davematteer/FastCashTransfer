import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Storingusers{
 // I want a method where i can store 
 // the user data
 //So i think i would use a map 

  private File file = new File("users.txt");
  private Scanner scanner;

  public void filecreationandreading(){
    try {
      scanner = new Scanner(file);

      if (file.createNewFile()){
        System.out.println("File created: "+ file.getName());   
      }
      else{
        System.out.println("File already exist");
      }
    } catch (FileNotFoundException e){
      System.out.println("An error occurred: "+ e.getMessage());
    }
    catch (IOException e){
      System.out.println("An error occurred"+ e.getMessage());
      e.printStackTrace();

    } finally{
      
      if (scanner != null){
        scanner.close();
      }
    }
    while (scanner.hasNextLine()){
      //TODO: Check if username is present to compare
      // or we can use it to prevent reusing a username, but we can do this with a hashmap so
      //there may be no need.
    }
  }

  public void writeFile(){
    try{
     scanner = new Scanner(file);
     
    }
    catch(IOException e){}
    finally{scanner.close();}

  }

  public Map<String,String> database(){

    final Map<String , String> users = new HashMap<>();  
    
    return users; 
  }  
  

} 

