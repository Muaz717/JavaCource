package Collections;

import java.util.*;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");

        map.put(person1, "123");
        map.put(person2, "123");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);
    }
}

class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return id == person.id && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    /*
    Контракт hashCode() equals()
    У двух проверяемых объектов вызываем метод hashCode()

    1) если хеши разные —> два объекта разные

    2) если хеши одинаковые —> вызываем equals()

    3) equals выдает ответ
     */
}
