package clean.code.design_patterns.requirements;

public abstract class Decoration implements DecorableSweets{
    protected  DecorableSweets cake;

   public Decoration(DecorableSweets cake)
   {
       this.cake = cake;
   }
   // public abstract String getDecoration();

    public String display(){
        return "";
    }

}
