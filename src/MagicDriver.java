import java.util.Arrays;
public class MagicDriver
{
    static int enemyCounter;
    public static void main(String[] args)
    {
        Goblin kyle = new Goblin("kyle",5, true);
        Goblin gerome = new Goblin("gerome",0, false);
        Dragon sirus = new Dragon("sirus", 20,true);
        Dragon bom = new Dragon("bom", 50,true);
        Golem ross = new Golem("ross", Golem.Element.fire,true);
        Golem bob = new Golem("bob",Golem.Element.ice,false);
        Sorcerer kim = new Sorcerer("Mage", 5, 20);


        System.out.println(kim);
        System.out.println(kyle);
        kyle.setNumClaws(9);//changed num of claws
        System.out.println("Now Kyle has " + kyle.getNumClaws() + " claws.");
        kim.Attack();/*
        System.out.println(sirus);
        System.out.println(ross);
        System.out.println(ross.getElement());
        System.out.println(bob);
        ross.setElement(Golem.Element.ice);//changed the Golem's element
        System.out.println(ross.getElement());//it will print out the new element*/

        Enemies[] myEnemies = {kyle, gerome, sirus, bom, ross, bob};

        for(int i = 1; i <= myEnemies.length; i++)
        {
            enemyCounter++;
        }// end of for loop

        System.out.println("You have " + enemyCounter + " enemies.");
        for(int i = 0; i <= myEnemies.length-1; i++)
        {

            if(i== myEnemies.length-1)
            {
                System.out.print("and " + myEnemies[i].getName());
            }
            else
            {
                System.out.print(myEnemies[i].getName() +", ");
            }
        }


    }// end of main
}// end of Magic Driver
