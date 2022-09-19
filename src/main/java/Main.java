import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Винсент", "ван Гог", 33));
        people.add(new Person("Сергей","Муравьёв-Апостол", 40));
        people.add(new Person("Михаил", "Булгаков", 45));
        people.add(new Person("Михаил", "Салтыков-Щердин", 62));
        people.add(new Person("Пётр", "Христорождественский", 18));
        people.add(new Person("Николай", "Ге", 27));
        people.add(new Person("Антуан", "де Сент-Экзюпери", 51));
        people.add(new Person("Шарль", "де Голль", 55));

        System.out.println(people);

        Collections.sort(people, new PersonSurnameLengthComparator(2));
        System.out.println(people);
    }
}
