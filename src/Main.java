import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Anton", 20, Stat.MAN);
        User user2 = new User(2, "Yarick", 24, Stat.MAN);
        User user3 = new User(3, "Sonya", 22, Stat.WOMAN);
        User user4 = new User(4, "Maxym", 28, Stat.MAN);
        User user5 = new User(5, "Anna", 18, Stat.WOMAN);
        User user6 = new User(6, "Oxana", 20, Stat.WOMAN);
        User user7 = new User(7, "Roman", 25, Stat.MAN);
        User user8 = new User(8, "Igor", 29, Stat.MAN);
        User user9 = new User(9, "Yuriy", 26, Stat.MAN);
        User user10 = new User(10, "Nastya", 23, Stat.WOMAN);

        List <User> users = new ArrayList();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        // users.stream().filter(user->user.getId()%2==0).forEach(System.out::println);
        // users.stream().filter(user->user.getName().length()>5).forEach(System.out::println);
        // users.stream().filter(user->user.getStat()==Stat.WOMAN).forEach(System.out::println);
    }
}
