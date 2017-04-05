package example.mediator;

/**
 * Created by Владислав on 04.04.2017.
 */
public class Admin implements User {
    Chat chat;
    String name;

    public Admin(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public Chat getChat() {
        return chat;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(String text) {
 chat.sedMessage(text,this);
    }

    @Override
    public void getMessage(String text) {
        System.out.println(this.name + " massege " + text +" .");
    }
}
