package clean.code.design_patterns.requirements;

public class Main
{

    public static void main(String[] args)
    {
        //TODO implement your design patterns in this package
        //Creating object using Builder pattern in java
        DecorableSweets whiteCake = new Cake.Builder().sugar(1).butter(0.5).eggs(2).vanila(2).flour(1.5). bakingpowder(0.75).milk(0.5).build();
        //Cake cherryCake=new Cake.Builder().sugar(1).butter(0.25).milk(0.75).flour(2).cherry(20).build();
         whiteCake.display();

        //System.out.println("cherryCake: "+cherryCake);

        // decorator adding for decorating cakes
        DecorableSweets decoratedCake=whiteCake;
        decoratedCake= new HappyBirthdayDeco(decoratedCake);
        decoratedCake.display();
    }

}
