public class Person {

    private String name;
    private Gender gender;

    public Person(String name, Gender gender ){
        this.name = name;
        this.gender = gender;
    }

    public Gender getGender(){
        return gender;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        String st = "";
        st += "Name: " + this.name;
        st += "\tGender: " + this.gender.toString();
        return st;
    }
    
}
