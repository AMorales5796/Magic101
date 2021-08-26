public abstract class Enemies
{
    private boolean hasClaws;
    String className = this.getClass().getSimpleName();
    String name = "";

    //Constructor
    public Enemies (String name, boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    }// end of constructor

    //Setter
    public void setHasClaws(boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    }//end of setter
    public void setName(String name){this.name = name;}//end of getter

    //Getter
    public boolean getHasClaws()
    {
        return hasClaws;
    }//end of getter
    public String getName(){return name;}//end of getter

    //To String
    @Override
    public String toString()
    {
        return "This " + className + " has claws? " + hasClaws;
    }
}// end of class
