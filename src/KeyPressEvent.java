import java.util.Scanner;

public class KeyPressEvent extends Event {


public KeyPressEvent(){
    super("keyPress");
}
   public void pressButton(){
       try (Scanner in = new Scanner(System.in)) {  // try-with-resources
           String button = in.nextLine();
           System.out.printf("Button [%s] pressed", button);
       }
    }
}
