public class User {
    private int id;
    private String name;
    private int old;
    private Stat stat;

    public User() {
    }

    public User(int id, String name, int old, Stat stat) {
        this.id = id;
        this.name = name;
        this.old = old;
        this.stat = stat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", old=" + old +
                ", stat=" + stat +
                '}';
    }
}
