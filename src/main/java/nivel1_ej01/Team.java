package nivel1_ej01;

public class Team {
    private String name;
    private String city;
    public Team(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Team" + "name=" + name +" city=" + city ;
    }
}
