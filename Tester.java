import java.util.*;
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static String name;

    public static int currentRoom;

    public static void main(String[] args)
    {
        boolean check = true;
        do
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Would you like to begin game or quit? ");
            String response = sc.next().toLowerCase();

            if( response.equals("begin"))
            {
                startgame();
                
               
            }
            if(response.equals("quit"))
            {
                check = false;
            }
        }while( check );
    }

    public static void gameIntro()
    {
        System.out.println("Congrats... you are playing Trump Escape! The country has been overran by trump clones \nand you must find a way and escape to Madagascar...\n\n");
    }

    public static void character()
    {
        System.out.print("\n\n\nWhat is your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        currentRoom = 1;

    }

    public static void startgame()
    {
        gameIntro();

        character();

        room1();
    }
    
    public static void room1()
    {
         boolean check = true;
        do
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("\n\n\nYou are in your office your door is closed and out your window you notice \na helicopter has just landed. Donald Trump gets out of the helicopter and enters the \nnearby building, as soon as Trump goes out of sight you hear loud bangs at the door. \nsomethings not right.");
            System.out.println("\nSuddenly the door opens and two Donald trumps burst through carrying \nbaseball bats. In unison the clones say \" Bow down to the regime and become a slave or die!\"");
            System.out.println("\n 1. Become slave 2. fight 3. run");
            String getAction = sc.next().toLowerCase();

            switch( getAction )
            {
                case "1": 
                {
                    check = false;
                    break;
                }
                case "2":
                {
                    double y = Math.random();
                    double x = .80;
                    if( y <= x)
                    {
                        System.out.println(" Using ex CIA training and you take them down with swiftness of a mongoose.\n\n");
                        room1b();
                        break;
                    }
                    else
                    {
                        System.out.println(" The two trump clones brutally beat you with a bat until your death...");
                        check = false;
                        break;
                    }
                }
                case "3":
                {
                    double a = Math.random();
                    double s = .75;
                    double d = .50;
                    if( a <= d)
                    {
                        System.out.println(" You hit the ground and your guts splatter every where");
                        check = false;
                        break;
                    }
                    if( d < a && a <= s)
                    {
                        System.out.println(" You land in a bush cushining your fall giving you time to decide how to escape");
                        room1b();
                        break;
                    }
                    else
                    {
                        System.out.println(" Before you hit you can make it out a trump clone grabs your shirt dragging you back in forcing you to become a slave.");
                    }
                }
            }
        }while( check );
       
    }
    public static void room1b()
    /**
     * 
     */
    {
         boolean check = true;
        do
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("It is no longer safe in Washington D.C. you decide to leave");
            System.out.println("\n 1. Take the nearby boat on the Washington river /n 2. Take the helicopter on the nearby helipad /n 3. Try to swim to Madagascar");
            String getAction = sc.next().toLowerCase();

            switch( getAction )
            {
                case "1": 
                {
                    
                    break;
                }
                case "2":
                {
                   
                   break;
                }
                case "3":
                {
                    room2c();
                    break;
                }
            }
        }while( check );
       
    }
    public static void room2c()
    {
        System.out.println("Thinking it is the smartest decision to swim across the Atlantic Ocean you decide to take the nearest bus to to the ocean.");
        System.out.println("Also using to be a navy seal, swimming in the ocean is a breeze. After about 3 days of swimming you begin to fatigue.");
        System.out.println("2 more days pass, you are on the brink of death from dehydration and starvation when you see the glimpse of a super yaht in the distance.");
        System.out.println("Fading in and out of consiosnes the boats gets closer and closer...\n\n");
        
    }
}


