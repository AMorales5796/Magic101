import java.util.Arrays;
public class MagicDriver
{
    static int enemyCounter;
    public static void main(String[] args)
    {
        Goblin kyle = new Goblin(5, true);
        Goblin gerome = new Goblin(0, false);
        Dragon sirus = new Dragon(20,true);
        Dragon bom = new Dragon(50,true);
        Golem ross = new Golem(Golem.Element.fire,true);
        Golem bob = new Golem(Golem.Element.ice,false);
        Sorcerer kim = new Sorcerer("Mage", 5, 20);


        System.out.println(kim);
        System.out.println(kyle);
        kyle.setNumClaws(9);
        System.out.println("Now Kyle has " + kyle.getNumClaws() + " claws.");
        System.out.println(sirus);
        System.out.println(ross);
        System.out.println(bob);
        //ross.get
        ross.setElement(Golem.Element.ice);
        System.out.println(ross.getElement());

        Enemies[] myEnemies = {kyle, gerome, sirus, bom, ross, bob};

        for(int i = 1; i <= myEnemies.length; i++)
        {
            enemyCounter++;
        }// end of for loop

        System.out.println("You have " + enemyCounter + " enemies.");
        for(int i = 0; i <= myEnemies.length-1; i++)
        {
            System.out.println(myEnemies.getClass());
        }


    }// end of main
}// end of Magic Driver
