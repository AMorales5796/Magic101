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
    public int Attack()
    {
            Scanner scan = new Scanner(System.in);
            System.out.println("What attack will you use? [Enter number])" +
                    "\n1. Lighting Flash" +
                    "\n2. Hail Storm" +
                    "\n3. Wind Slash");
            attackChoice = scan.nextInt();
            return attackChoice;
    }//end of brain method
    // Level Up & Power Up Method
    /*public int LvlUp()
    {
        if(gotAttacked == )
        {
            setLevel();
        }//if

    }//end of brain method*/

    //ToString
    public String toString()
    {
        String output = "\nHello young " + role + "! Welcome to Magic101";
            output += "\nYour at level " + level;
            output += "\nYour health is currently " + health + " xp.";
        return output;
    }// end of toString
}// end of class
