package ru.vasilev;

public class SharedSource implements Comparable<SharedSource> {
    private String name;

    public SharedSource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(SharedSource o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Source #: " + name;
    }
}