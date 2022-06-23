package Student;

public class Student {
    private String name;
    private int age;
    private String sex;
    private int idCard;

    public Student() {
    }

    public Student(String name, int age, String sex, int idCard) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }
}
