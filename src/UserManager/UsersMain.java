package UserManager;

import java.util.ArrayList;

public class UsersMain {
    public static void main(String[] args) {
        UserManager userManager = new UserManager(new ArrayList<>());
        //létrehozom a usereket a constructorral
        User user1 = new User(1, "Sanyi", "sanyivagyok@sanyi.de");
        User user3 = new User(2, "Józsi", "anustitan11@yoyo.he");
        User user5 = new User(312, "NyestEmber", "ragogumi@ssdao.ss");
        //hozzáadom őket a set-hez
        userManager.addToList(user1, user1, user3, user3, user5); //duplikáchio chio chiochips

        System.out.println(userManager.getUserByEmail("sanyivagyok@sanyi.de").toString());
        System.out.println("--------------");

        userManager.getAllUserEmails();
        System.out.println("--------------");

        System.out.println(userManager.getUsersByEmail("SanYivagYok@sanyI.dE").toString());


    }
}