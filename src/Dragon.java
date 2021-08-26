public class Dragon extends Enemies
{
    //Instance Variables
    private int wingSpan;// in yards
    private String windForce;// in mph & used for brain method

    //Constructor
    public Dragon (int wingSpan, boolean hasClaws)
    {
        super(hasClaws);
        this.wingSpan = wingSpan;
    }// end of constructor

    //Setters
    public void setWingSpan(int wingSpan)
    {
        this.wingSpan = wingSpan;
    }// end of setter

    //Getters
    public int getWingSpan()
    {
        return wingSpan;
    }// end of getter

    //Brain Method
    public String whatIsWindForce()
    {
        if(wingSpan > 0 && wingSpan <= 10)
        {
            windForce = "Weak";
        }// this condition states that wind force is weak
        else if(wingSpan > 10 && wingSpan <= 30)
        {
            windForce = "Moderate";
        }
        else
        {
            windForce = "STRONG";
        }
        return windForce;
    }// end of Brain Method

    //ToString
    public String toString()
    {
        String output = "\nAwesome! (Well kind of since...) A Dragon appeared!";
                output += "\n" + super.toString();
               output += "\nThis Dragon's wings are " + wingSpan + " yards long.";
               output += "\nThis dragon's wind force is: " + whatIsWindForce() +".";
               return output;
    }// end of toString
}// end of class
