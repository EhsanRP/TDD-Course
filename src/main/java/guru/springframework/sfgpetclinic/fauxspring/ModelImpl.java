package guru.springframework.sfgpetclinic.fauxspring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ehsan Rostami Pour
 * @version 1.0
 * @date 7/11/2021 11:24 PM
 */
public class ModelImpl implements Model {

    private HashMap<String, Set<Object>> collection = new HashMap<>();

    @Override
    public void addAttribute(String key, Object o) {
        if (collection.containsKey(key)) {

            var newData = collection.get(key);
            newData.add(o);

            collection.put(key, newData);
        }
        collection.put(key, Set.of(o));
    }

    @Override
    public void addAttribute(Object o) {
        //do nothing
    }

    @Override
    public int getSize(String key) {
        var collectionToCheck = collection.get(key);
        return collectionToCheck.size();
    }

    @Override
    public void printAll(){
        System.out.println(collection.keySet());
    }
}
