import java.util.Set;

public class UserManager {
    private final Set<User> users;

    public UserManager(Set<User> users) {
        this.users = users;
    }

    public void addToSet(User... user) {
        this.users.addAll(users);
    }

}
