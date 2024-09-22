import java.util.Scanner;

public class Authentication{

  // SOme attributes 
  private Scanner input = new Scanner(System.in);
  private String username;
  private int age;
  private String password;

  public Authentication(String username,String password, int age){
    this.username = username;
    this.password = password;
    this.age = age;
  }

  public String grabName(){
    System.out.println("Enter your name: ");
    this.username = input.nextLine();
    return username;
  }
  
  public String grabPassword(){
    System.out.println("Enter your password: ");
    this.password = input.nextLine();
    return password;
  }

  public int grabAge(){
    System.out.println("Enter your age: ");
    this.age = Integer.parseInt(input.nextLine());
    return age;
  }
  
  public static void main(String[] args){

    Authentication user = new Authentication("","",0);
    String name = user.grabName();
    String password = user.grabPassword();
    int age = user.grabAge();

    System.out.print("Your name is: " + name);
    System.out.print(" Your age is: "+ age);
    System.out.print(" Your password is: "+password);

  }
}
