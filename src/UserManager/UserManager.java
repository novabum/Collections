package UserManager;

import java.util.List;
import java.util.ArrayList;


public class UserManager {
    /*privát mert csak ezen a classon belül használjuk.
     final, mert nem válthat értéket miután assigne-oltuk :)
     */
    private final List<User> users;

    public UserManager(List<User> users) {
        this.users = users;
    }

    /*public, hogy meghívhható legyen Mainből
    void, mert nem ad vissza semmit
    usereket tesz a Listbe
     */
    public void addToList(User... user) {
        this.users.addAll(List.of(user)); //Arrays.toList is jó
    }

        /*public, hogy meghívhható legyen Mainből
        email string alapján megkeresi a user nevét
        Usert ad vissza.
        emailt kérünk be hozzá, azt vizsgáljuk a ciklusban, ha találunk visszaadjuk a Usert.
         */
   public User getUserByEmail(String email){
       for (User user : users)
           if (user.getEmail().equalsIgnoreCase(email)) {
               return user;
           }
       return null;
   }
    /*public, hogy meghívhható legyen Mainből
    void, mert nem ad vissza semmit
    végigiterálunk a users-en és kiírjuk az aktuális user email címét
         */
    public void getAllUserEmails(){
        for (User user : users)
            System.out.println(user.getEmail());
    }

    /*
    public, hogy meghívhható legyen Mainből
    egy user List-et ad vissza
    egy email címet vár paraméterként, a duplikációkat is visszaadja.
    */
    public List<User> getUsersByEmail(String email){
        List<User> userFound = new ArrayList<>(List.of());
        for (User user: users){
            if (user.getEmail().equalsIgnoreCase(email)) {
                userFound.add(user);
            }
        }
        return userFound;
    }
}
