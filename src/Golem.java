public class Golem extends Enemies
{
    //Instance Variables
    Element element;
    public enum Element
    {
        fire, ice, earth, rock
    }
    public String type = "";
    //Constructor
    public Golem (Element element, boolean hasClaws)
    {
        super(hasClaws);
        this.element = element;
    }// end of constructor

    //Setter
    public void setElement(Element element)
    {
        this.element = element;
    }// end of setter
    //Getter
    public enum getElement
    {
        element;
    }//end of getter
    //Brain Method
    public String Output() {
        switch (element) {
            case fire:
                type = "Watch out! This one is hot";
                break;

            case ice:
                type = "Fridays are better.";
                break;

            case earth: case rock:
                type = "Weekends are best.";
                break;

            default:
                type = "Midweek days are so-so.";
                break;
        }
        return type;
    }

    //To String
    public String toString()
    {
        String output = "\nA Golem appeared!";
                output += "\n"+ super.toString();
                output += "\n" + Output() + "\n";
        return output;
    }//end of toString
}
// end of class