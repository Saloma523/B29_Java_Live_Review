package week13.LanguageTask;

import week13.LanguageTask.Language;

public class English implements Language {

    @Override
    public void hello() {
        System.out.println("greetings");

    }

    @Override
    public void bye() {

        System.out.println("good bye");
    }
}
/*
create a class English and implement Language
            create a class Spanish and implement Language
            add as many languages as you want
            test the description and translates methods
 */