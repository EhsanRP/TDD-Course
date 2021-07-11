package guru.springframework.sfgpetclinic.fauxspring;

import java.util.Set;

public interface Model {

    void addAttribute(String key, Object o);

    void addAttribute(Object o);

    int getSize(String key);

    void printAll();
}
