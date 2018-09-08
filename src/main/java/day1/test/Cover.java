package day1.test;

public enum Cover {
    SOFT("miekka"),
    HARD("twarda");
    private String name;

    Cover(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
