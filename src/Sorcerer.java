import java.util.Random;
import java.util.Scanner;

public class Sorcerer
{
    private int health;
    private int level;
    private String role;
    public int attackChoice;

    //Constructor
    public Sorcerer(String role, int level, int health)
    {
        this.health = health;
        this.level = level;
        this.role = role;
    }// end of constructor

    //Setters
    public void setHealth(int health)
    {
        this.health = health;
    }// end of setter
    public void setLevel(int level)
    {
        this.level = level;
    }//end of setter
    public void setRole(String role)
    {
        this.role = role;
    }//end of setter

    //Getter
    public int getHealth() {
        return health;
    }//end of getter
    public int getLevel() {
        return level;
    }//end of getter
    public String getRole() {
        return role;
    }//end of getter
    public int getAttack(){return attackChoice;}//end of brain method getter

    //Brain Methods***
    // Attack Method
    public String Attack()
    {
            Scanner scan = new Scanner(System.in);
            System.out.println("What attack will you use? [Enter number]" +
                    "\n1. Lighting Flash" +
                    "\n2. Hail Storm" +
                    "\n3. Wind Slash");
            attackChoice = scan.nextInt();
            return LvlUp(promptMessage);
    }//end of brain method
    String promptMessage = "";

    public String LvlUp(String promptMessage)
    {
        Random rd = new Random(); // creating Random object
        boolean outcome = rd.nextBoolean();
        if(outcome == true)
        {
            setLevel(++level);
            promptMessage = "Yay! You are now at level " + getLevel();
        }//if
        else if (outcome == false)
        {
            setHealth(--health);
            promptMessage = "Sorry. Your attack was not effective. \nYour health is now " + getHealth() + " xp";
        }
        return promptMessage;
    }//end of brain method
    /*public String promptLvlUp()
    {
        return "Yay! You are now at level " + getLevel();
    }

    public String Fail()
    {
        return "Sorry. Your attack was not effective. \nYour health is now " + getHealth() + " xp";
    }*/

    //ToString
    public String toString()
    {
        String output = "\nHello young " + role + "! Welcome to Magic101";
            output += "\nYour at level " + level;
            output += "\nYour health is currently " + health + " xp.";
        return output;
    }// end of toString
}// end of class
