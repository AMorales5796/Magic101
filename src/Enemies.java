public abstract class Enemies
{
    private boolean hasClaws;
    String className = this.getClass().getSimpleName();

    public Enemies (boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    }// end of constructor

    @Override
    public String toString()
    {
        return "This " + className + " has claws? " + hasClaws;
    }
}// end of class
