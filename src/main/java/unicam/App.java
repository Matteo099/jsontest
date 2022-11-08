package unicam;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("jon doe", 22, "chicago"));
        people.add(new Person("Fabrizio Fornari", 31, "Camerino"));
        System.out.println(new Gson().toJson(people));
    }
}
