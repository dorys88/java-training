package clean.code.design_patterns.requirements;

public class MikeyMouseDeco extends Decoration{

    public MikeyMouseDeco(  DecorableSweets cake) {
        super(cake);
    }
    public String display(){
        System.out.println("... i'm from MikeyMouseDeco class... (*) (*) (*) Happy Birthday, baby! * * * ");

        return"";
    };

}
