public class Student {
    private final String name;
    private char grade;
    private int group;
    private String secretNickName;

    Student(String name, char grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade  = grade;
    }

}

