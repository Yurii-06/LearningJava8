package ua.proky.java8.ex1;

public class School implements Comparable<School> {
    private String name;
    private String city;

    public School(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public int compareTo(School s) {
        return s.getCity().compareTo(city);
    }
}
