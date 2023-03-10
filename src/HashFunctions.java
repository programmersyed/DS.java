import java.util.*;

public class HashFunctions {
    record Person (String name){

    }
    record Daimond (String name){}

    public static void main(String[] args) {
        HashMap<Person, Daimond> hashes = new HashMap<>();
        hashes.put(new Person("Jameela"), new Daimond("Africa"));
        //Record does all the hardworking if no record then you have to manually override
        System.out.println(new Person("Jameela").hashCode());
        //Without override, it is going to think that Jameela is different from the other when in fact they are both the same and give them another hashcode
    }
    //Hashfunctions.Lists and Maps are the most important
}

