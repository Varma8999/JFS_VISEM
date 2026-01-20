class Passport{
    int PassportNo;
    String nationality;
    Passport(int PassportNo, String nationality){
        this.PassportNo = PassportNo;
        this.nationality = nationality;
    }
}

class Person{
    int id;
    String name;
    Passport passport;
    Person(int id, String name, Passport passport){
        this.id = id;
        this.name = name;
        this.passport = passport;
    }
}

public class OneToOneDemo{
    public static void main(String[] args) {
        Passport passport = new Passport(123456, "Indian");
        Person person = new Person(1, "Banti", passport);

        System.out.println("Person ID: " + person.id);
        System.out.println("Person Name: " + person.name);
        System.out.println("Passport No: " + person.passport.PassportNo);
}
}
