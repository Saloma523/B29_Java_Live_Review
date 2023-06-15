package week11.discordUserTask;

import java.time.LocalDate;

public class Admin extends DiscordUser{


    public Admin(String role, String name, int id, LocalDate creatDate) {
        super("Admin", name, id, creatDate);
    }

    public void createChannel(){
        System.out.println("creating new discord channel");
    }

    @Override
    public void sendMessage() {
        System.out.println("sending announcement");
    }
}
