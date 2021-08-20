public class MagicDriver
{
    public static void main(String[] args)
    {
        Goblin kyle = new Goblin(5, true);
        Goblin gerome = new Goblin(0, false);
        Dragon sirus = new Dragon(20,true);
        Dragon bom = new Dragon(50,true);
        Golem ross = new Golem(Golem.Element.fire,true);



        System.out.println(kyle.toString());
        kyle.setNumClaws(9);
        System.out.println("Now Kyle has " + kyle.getNumClaws() + " claws.");
        System.out.println(sirus.toString());
        System.out.println(sirus.whatIsWindForce());
        System.out.println(ross.toString());
        ross.setElement(Golem.Element.ice);

        Enemies[] myEnemies = {kyle, gerome, sirus, bom, ross};

        for(int i = 0; i <= myEnemies.length; i++)
        {
            System.out.println(myEnemies);
        }// end of for loop
    }// end of main
}// end of Magic Driver
