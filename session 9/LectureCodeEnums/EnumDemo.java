import java.util.ArrayList;

public class EnumDemo {

    public static void main(String[] args){

        Person p1 = new Child("David", Gender.MALE);
        Person p2 = new Child("Mary", Gender.FEMALE);
        Person p3 = new Parent("Robert", Gender.MALE);
        Person p4 = new Parent("Suzy", Gender.FEMALE);

        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        for(Person person: people){
            
            // if(person.getGender() == Gender.FEMALE){
            //     System.out.println(person);
            // }

            if(person.getGender() == Gender.FEMALE && person instanceof Parent){
                System.out.println("Parents who are females");
                System.out.println(person);
            }
        }


    }
    
}
