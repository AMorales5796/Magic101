public class Goblin extends Enemies
{
    //Instance Variables
    private int numClaws;
    //Constructor
    public Goblin (int numClaws, boolean hasClaws)
    {
        super(hasClaws);
        this.numClaws = numClaws;
    }// end of constructor
    //Setters
    public void setNumClaws(int numClaws)
    {
        this.numClaws = numClaws;
    }// end of setter
    //Getters
    public int getNumClaws()
    {
        return numClaws;
    }//end of getter
    //Brain Methods

    //ToString
    public String toString()
    {
        String output = "\nA Goblin appeared!";
                output += "\n" + super.toString();
               output += "\nThis Goblin has " + numClaws + " claws.\n";
        return output;
    }//end of toString
}// end of class Goblin
