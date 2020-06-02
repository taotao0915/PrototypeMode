import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable{
    private String name;
    private int sex;
    private List<String> friends;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    protected Object clone() {
        Person person = null;
        try {
            person = (Person) super.clone();
            List<String> newFriends = new ArrayList<>();
            newFriends.addAll(person.getFriends());
            person.setFriends(newFriends);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }
}
