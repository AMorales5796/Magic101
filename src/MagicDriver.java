public class MagicDriver
{
    public static void main(String[] args)
    {
        Goblin kyle = new Goblin(5, true);
        Goblin gerome = new Goblin(0, false);
        Dragon sirus = new Dragon(20,true);


        System.out.println(kyle.toString());
        kyle.setNumClaws(9);
        System.out.println("Now Kyle has " + kyle.getNumClaws() + " claws.");
        System.out.println("Sirus wind force: " + sirus.whatIsWindForce());

        Enemies[] myEnemies = {kyle, gerome};

        for(int i = 0; i <= myEnemies.length; i++)
        {
            System.out.println(myEnemies);
        }// end of for loop
    }// end of main
}// end of Magic Driver
