package hashCodeAndEquals.hascode;

import java.util.HashMap;
import java.util.Map;

public class UserMain {
    public static void main(String[] args) {
        Map<User, User> users = new HashMap<>();

        User user1 = new User(1, "email1", "Jordan1", "Cotrina1");
        User user2 = new User(1, "email2", "Jordan2 Kerth", "Cotrina2");
        User user3 = new User(1, "email3", "Aurora", "Cotrina3");
        User user4 = new User(1, "email4", "Jose", "Cotrina4");

        users.put(user1, user1);
        users.put(user2, user2);
        users.put(user3, user3);
        users.put(user4, user4);
    }
}
