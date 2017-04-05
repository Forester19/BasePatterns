package example.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Владислав on 04.04.2017.
 */
public class SimpleTextChat implements Chat {
    User admin;
    List<User> userList = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }
    public void addUserToChat(User user){
        this.userList.add(user);
    }

    @Override
    public void sedMessage(String text, User user) {
for (User u: userList){
    if (u != user){
        u.getMessage(text);
    }
    admin.getMessage(text );
}
    }
}
