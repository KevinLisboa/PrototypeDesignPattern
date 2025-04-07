import java.util.HashMap;
import java.util.Map;

public class AnimalRegistry {
    private Map<String, Animal> prototypes = new HashMap<>();

    public void addPrototype(String key, Animal prototype) {
        prototypes.put(key, prototype);
    }

    public Animal getAnimal(String key) {
        Animal prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }
}