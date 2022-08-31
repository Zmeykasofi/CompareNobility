import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Винсент", "ван Гог", 33));
        people.add(new Person("Сергей","Муравьёв-Апостол", 40));
        people.add(new Person("Михаил", "Булгаков", 45));
        people.add(new Person("Михаил", "Салтыков-Щердин", 62));
        people.add(new Person("Пётр", "Христорождественский", 15));
        people.add(new Person("Николай", "Ге", 17));
        people.add(new Person("Антуан", "де Сент-Экзюпери", 51));
        people.add(new Person("Шарль", "де Голль", 55));

        System.out.println("Несортированный список: " + people);

        Predicate<Person> predicate = person -> person.getAge() < 18;
        people.removeIf(predicate);

        people.sort(new PersonSurnameLengthComparator(2));
        System.out.println("Отсортированный по знатности список совершеннолетних: " + people);
    }
}
