package clean.code.design_patterns.requirements;

public class NewYearDeco extends Decoration{

    public NewYearDeco(  DecorableSweets cake) {
        super(cake);
    }
    public String display(){
        return "... i'm from NewYearDeco class Happy New Year! * * * * * * * ";
    };

}
