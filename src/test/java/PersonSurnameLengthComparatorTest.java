import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование: Comparator")
class PersonSurnameLengthComparatorTest {
    private final PersonSurnameLengthComparator surnameCompare = new PersonSurnameLengthComparator(3);
    private final Person person1 = new Person("Абдула", "ибн Халиф Али", 38);
    private final Person person2 = new Person("Анри", "Тулуз-Лотрек", 64);
    private final Person person3 = new Person("Мария", "Склодовская-Кюри", 64);
    private final Person person4 = new Person("Роберт", "ван де Сен-Симон", 16);
    private final Person person5 = new Person("Ким", "ван Бинь Дунь-Дунь", 42);

    @DisplayName("Тестирование сравнения людей с одинаковым возрастом и кол-вом слов в фамилии")
    @Test
    public void testEqualSameAge() {
        int result = surnameCompare.compare(person2, person3);
        Assertions.assertEquals(0, result);
    }

    @DisplayName("Тестирование сравнения людей с разным возрастом и кол-вом слов в фамилии")
    @Test
    public void testGreaterThan() {
        int result = surnameCompare.compare(person1, person3);
        Assertions.assertEquals(1, result);
    }

    @DisplayName("Тестирование сравнения людей с разным возрастом и одниковым кол-вом слов в фамилии больше максимального")
    @Test
    public void testGreaterThanMoreMax() {
        int result = surnameCompare.compare(person5, person4);
        Assertions.assertEquals(1, result);
    }
    
    @DisplayName("Тестирование сравнения людей с разным возрастом и кол-вом слов в фамилии")
    @Test
    public void testLessThan() {
        int result = surnameCompare.compare(person2, person1);
        Assertions.assertTrue(result <= -1);
    }
}