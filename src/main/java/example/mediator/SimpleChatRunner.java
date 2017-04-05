package example.mediator;

/**
 * Created by Владислав on 04.04.2017.
 */
public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat simpleTextChat = new SimpleTextChat();
        User admin = new Admin(simpleTextChat,"Admin");
        User USER1 = new SimpleUser("User1",simpleTextChat);
        User user2 = new SimpleUser("User2",simpleTextChat);

        simpleTextChat.setAdmin(admin);
        simpleTextChat.addUserToChat(USER1);
        simpleTextChat.addUserToChat(user2);
        USER1.sendMessage("hello im user1");
    }
}
