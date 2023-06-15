package week13.LanguageTask;

public class ClassRoom {


    public static void main(String[] args) {



        //Language obj = new Language();
        English english = new English();
        english.hello();
        english.bye();

        System.out.println("------------------");

        Spanish spanish = new Spanish();
        spanish.hello();
        spanish.bye();

        System.out.println(spanish.DEFAULT_ENCODING); // this works but

        System.out.println(Language.DEFAULT_ENCODING);// this is the correct way

       // spanish.description(); // static methods ar not inherited from the inter face

        Language.description();

        english.translate(spanish,"translate");
    }


}
