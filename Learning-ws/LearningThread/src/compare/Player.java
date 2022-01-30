package compare;

public class Player implements Comparable<Player>{
    private int ranking;
    private int age;
    private String name;

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player() {
    }

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Player otherPlayer) {
        return Integer.compare(getRanking(), otherPlayer.getRanking());
    }


    @Override
    public String toString() {
        return "Player{" +
                "ranking=" + ranking +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
