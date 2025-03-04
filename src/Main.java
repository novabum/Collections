import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* 1. feladat: User management system
        User class - id, name, email
        UserManager class - Usereket tárol, és a céljának megfelelően egy User többször is megjelenhet a tárolóban;
            - van egy getUserByEmail metódusa (ha nem talál, null-t ad vissza)
        - ignorálja, ha az email cím többször szerepel
        - van egy  getAllUserEmails metódusa, amely az összes email
        címet visszaadja - lehet duplikáció
        - és van egy getUsersByEmail amely mindig egy collection-t ad vissza,
        ha nem talál User-t egyáltalán, akkor szimplán üres lesz a lista. - lehet duplikáció
        */
        //megidézem a usermanagert
        UserManager userManager = new UserManager(new HashSet<>());

        //létrehozom a usereket a constructorral
        User user1 = new User(1, "Sanyi", "sanyivagyok@sanyi.de");
        User user2 = new User(2, "Sanyi", "sanyivagyok@sanyi.de");
        User user3 = new User(3, "Józsi", "anustitan11@yoyo.he");
        User user4 = new User(4, "Józsi", "anustitan11@yoyo.he");
        User user5 = new User(5, "NyestEmber", "ragogumi@ssdao.ss");
        //hozzáadom őket a set-hez
        userManager.addToSet(user1, user2, user3, user4, user5);




    }
}