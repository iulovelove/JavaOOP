package Student;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("mathhew chen");
        s1.setAge(21);
        s1.setIdCard(13213213);
        s1.setSex("男");
        System.out.println("姓名："+s1.getName()+",年龄："+s1.getAge()+",性别："+s1.getSex()+",身份证号："+s1.getIdCard());
    }
}
