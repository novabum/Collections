package UserManager;

public class User {
    private int id;
    private final String name;
    private final String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

/*Készítetem egy Override-ot, hogy csak a nevét adja vissza.
* Public, mert mindenhonnan használható
* String, mert stringet ad vissza
* */
    @Override
    public String toString() {
        return name;
    }

}
