import Authentication;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Storingusers{
 // I want a method where i can store 
 // the user data
 //So i think i would use a map 

  private File file = new File("users.txt");
  private Scanner scanner = new Scanner(file);
 
  public void filecreation(){
    try {
      if (file.createNewFile()){
        System.out.println("File created: "+ file.getName());   
      }
      else{
        System.out.println("File already exist");
      }
    } catch (IOException e){
      System.out.println("An error occurred");
      e.printStackTrace();
    }
  }

  public Map<String,String> database(){

    final Map<String , String> users = new HashMap<>();  
    
    
  }  
  

} 

