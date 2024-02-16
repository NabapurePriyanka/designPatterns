package creational.registry;

import java.util.HashMap;

public class StudentRegistry {

    private HashMap<String, Student> registry;

    public StudentRegistry(){
        this.registry = new HashMap<>();
    }

    public Student addToRegistry(String key, Student student){

        if(registry.containsKey(key)){
            System.out.println("Protype already exists");
        } else{
            registry.put(key, student);
        }
        return student;
    }

    public Student getFromRegistry(String key){
        return registry.get(key);
    }
}
