package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();

        User user1 = new User(group, "User 1");
        User user2 = new User(group, "User 2");
        User user3 = new User(group, "User 3");
        User user4 = new User(group, "User 4");
        User user5 = new User(group, "User 5");
        User user6 = new User(group, "User 6");
        User user7 = new User(group, "User 7");
        User user8 = new User(group, "User 8");
        User user9 = new User(group, "User 9");
        User user10 = new User(group, "User 10");

        group.addColleague(user1);
        group.addColleague(user2);
        group.addColleague(user3);
        group.addColleague(user4);
        group.addColleague(user5);
        group.addColleague(user6);
        group.addColleague(user7);
        group.addColleague(user8);
        group.addColleague(user9);
        group.addColleague(user10);

        user1.send("Hola, User 2!");
        user10.send("Hola, a todos!");
    }
}

