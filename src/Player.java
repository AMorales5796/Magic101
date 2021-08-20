public class Player
{
    private int health;
    private int level;
    private String role;

    //Constructor
    public Player(String role, int level, int health)
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

    //ToString
    public String toString()
    {
        String output = "\nHello young " + role + "! Welcome to Magic101";
            output += "\nYour level is " + level;
            output += "\nYour health is currently " + health + " xp.\n";
        return output;
    }// end of toString
}// end of class
