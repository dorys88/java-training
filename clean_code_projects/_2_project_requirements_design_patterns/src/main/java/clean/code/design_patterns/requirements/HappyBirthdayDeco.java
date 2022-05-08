package clean.code.design_patterns.requirements;

public class HappyBirthdayDeco extends Decoration{
    public HappyBirthdayDeco(  DecorableSweets cake) {
        super(cake);
    }

    public String display(){
        System.out.println("... i'm from HappyBirthdayDeco class Happy Birthday! :-) ");
        return"";
    };


}
