package main.java;
import java.util.*;  

class WindowBlinds
{
    String openORclose = "close";
    String color = "green";
    String material = "silk";

    String open_or_close() {
        return openORclose;
    }

    void openBlinds() {
        openORclose = "open";
        System.out.println("You have opened the window blinds.");
    }

    void closeBlinds() {
        openORclose = "close";
        System.out.println("You have closed the window blinds.");
    }

    void getDescription() {
        System.out.println("The window blinds are " + color + " color and made up of " + material + " material. The blinds are currently " + openORclose);
    }

    void changeBlinds() {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.println("What is the color of the new blinds? ");  
        String new_color= sc.nextLine();          // reads string  
        System.out.println(new_color + " is a good choice.\n");    
        
        color = new_color;

        System.out.println("What is the material of the new blinds? ");  
        String new_material= sc.nextLine();          // reads string  
        System.out.println(new_material + " is a good choice.\n"); 

        material = new_material;
    }

    void getStatus() {
        System.out.println("\nThe blinds are " + openORclose);
    }
}
public class WindowCovering
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        WindowBlinds blinds = new WindowBlinds();
        while (true)
        {
            System.out.println("\n\n\nChoose an option.");
            System.out.println("1. Show details about the window covering");
            System.out.println("2. Open blinds");
            System.out.println("3. Close blinds");
            System.out.println("4. Change blinds");
            System.out.println("5. Get blinds status");
            System.out.println("6. Quit");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    blinds.getDescription();
                    break;
                }
                case 2:
                {
                    blinds.openBlinds();
                    break;
                }
                case 3:
                {
                    blinds.closeBlinds();
                    break;
                }
                case 4:
                {
                    blinds.changeBlinds();
                    break;
                }
                case 5:
                {
                    blinds.getStatus();
                    break;
                }
                case 6:
                {  
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Invalid option!");
                    break;
                }
            }
        }
    }
}
