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
    public Golem (String name, Element element, boolean hasClaws)
    {
        super(hasClaws);
        super(name);
        this.element = element;
    }// end of constructor

    //Setter
    public void setElement(Element element)
    {
        this.element = element;
    }// end of setter
    //Getter
    public String getElement()
    {
        return "This is a " + element.toString() + " type Golem.";
    }//end of getter
    //Brain Method
    public String Output() {
        switch (element) {
            case fire:
                type = "Watch out! This one is hot";
                break;

            case ice:
                type = "It just got chilly...";
                break;

            case earth: case rock:
                type = "Stand your ground!";
                break;

            default:
                type = "We have a mysterious one here";
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