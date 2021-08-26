public class Goblin extends Enemies
{
    //Instance Variables
    private int numClaws;
    //add another variable

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
    /* void gotAttacked()
    {
        if()
        {

        }
    }*/
    public int realisticNumOfClaws()
    {
        if (numClaws < 0)
        {
            setNumClaws(0);
        }
        else if (numClaws>10)
        {
            setNumClaws(10);
        }
        return numClaws;
    }//end of method

    //ToString
    public String toString()
    {
        String output = "\nA Goblin appeared!";
                output += "\n" + super.toString();
               output += "\nThis Goblin has " + realisticNumOfClaws() + " claws.\n";
        return output;
    }//end of toString
}// end of class Goblin
