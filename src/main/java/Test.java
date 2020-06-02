import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("张三");
        p1.setSex(1);
        List<String> friends = new ArrayList<>();
        friends.add("小红");
        friends.add("小李");
        p1.setFriends(friends);

        Person p2 = (Person) p1.clone();
        System.out.println(p1.getName()+","+p1.getSex()+","+p1.getFriends());
        System.out.println(p2.getName()+","+p2.getSex()+","+p2.getFriends());




        friends.add("小黄");
        friends.add("小陈");
        p1.setFriends(friends);
        System.out.println(p1.getFriends());
        System.out.println(p2.getFriends());

    }
}
