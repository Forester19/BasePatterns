package example.mediator;

/**
 * Created by Владислав on 04.04.2017.
 */
public class SimpleUser implements User {
    String name;
    Chat chat;

    public SimpleUser(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public Chat getChat() {
        return chat;
    }

    @Override
    public void sendMessage(String text) {
      chat.sedMessage(text, this);
    }

    @Override
    public void getMessage(String text) {
        System.out.println(this.name + " messege " + text);
    }
}
