package entity;

public class User<K> {
    private K id;
    private String name;
    public Group group;

    public User(K id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
