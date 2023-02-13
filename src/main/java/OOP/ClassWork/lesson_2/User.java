package OOP.ClassWork.lesson_2;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private Integer age;


    private Personal subordinates = new Personal();


    public void addSubordinates(Personal personal) {
        subordinates = personal;
    }
    public void addOneUser(User user){
        subordinates.addUser(user);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        String resalt = String.format("Имя = %s ,Фамилия = %s ,Возраст = %s ",firstName,lastName,age);
        for (User user : subordinates) {
            resalt.concat(String.format("Имя боса = %s, %s ",firstName, user.toString()));
        }
        return resalt;
    }

    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        int name1 = this.getFirstName().compareTo(o.getFirstName());
        if (name1 != 0) {
            return name1;
        }
        int last_Name = this.getLastName().compareTo(o.getLastName());
        if (last_Name != 0) {
            return last_Name;
        }
        return this.getAge() - o.getAge();
    }
}
