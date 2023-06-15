package week11.discordUserTask;

import java.time.LocalDate;

public class Student extends DiscordUser{

    int loveForJava;

    public Student(String role, String name, int id, LocalDate creatDate, int loveForJava) {
        super("student", name, id, creatDate);
        this.loveForJava = loveForJava;
    }
}
