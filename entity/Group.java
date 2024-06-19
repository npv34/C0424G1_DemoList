package entity;

public class Group {
    private int id;
    public String name;
    public School school;

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
