package Models;public class User {    public String fname;    public String lname;    public String email;    public int weight;    public int heightFeet;    public int heightInches;    public int age;    public boolean smoker;    public char sex;    public User(String email, String fname, String lname, int weight, int heightFeet, int heightInches, int age, boolean smoker, char sex){        this.fname = fname;        this.lname = lname;        this.weight = weight;        this.heightFeet = heightFeet;        this.heightInches = heightInches;        this.age = age;        this.smoker = smoker;        this.email = email;        this.sex = sex;    }    public User(){}}