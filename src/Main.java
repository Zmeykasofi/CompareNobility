import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Винсент", "ван Гог", 33));
        people.add(new Person("Сергей", "Муравьёв-Апостол", 40));
        people.add(new Person("Михаил", "Булгаков", 45));
        people.add(new Person("Михаил", "Салтыков-Щердин", 62));
        people.add(new Person("Пётр", "Христорождественский", 15));
        people.add(new Person("Николай", "Ге", 17));
        people.add(new Person("Антуан", "де Сент-Экзюпери", 51));
        people.add(new Person("Шарль", "де Голль", 55));

        System.out.println("Список несортированный: " + people);

        Comparator<Person> comparator = (person1, person2) -> {
            if (person1.howManyWords(person1.getSurname()) <= 2 && person2.howManyWords(person2.getSurname()) <= 2) {
                if (person1.howManyWords(person1.getSurname()) < person2.howManyWords(person2.getSurname())) {
                    return -1;
                } else if (person1.howManyWords(person1.getSurname()) > person2.howManyWords(person2.getSurname())) {
                    return 1;
                }
            }
            return Integer.compare(person1.getAge(), person2.getAge());
        };

        people.sort(comparator);
        System.out.println("Отсортированный по знатности список: " + people);
    }
}
