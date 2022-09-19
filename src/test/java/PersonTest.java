import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование: Person")
class PersonTest {
    private final Person person1 = new Person("Абдула", "ибн Халиф Али", 38);
    private final Person person2 = new Person("Анри", "Тулуз-Лотрек", 64);
    private final Person person3 = new Person("Роберт", "ван де Сен-Симон", 16);

    @DisplayName("Тестирование подсчёта слов в фамилии с пробелами")
    @Test
    void howManyWordsSpace() {
        Assertions.assertEquals(3, person1.howManyWords(person1.surname));
    }

    @DisplayName("Тестирование подсчёта слов в фамилии с дефисами")
    @Test
    void howManyWordsHyphen() {
        Assertions.assertEquals(2, person2.howManyWords(person2.surname));
    }

    @DisplayName("Тестирование подсчёта слов в фамилии с пробелами и дефисами")
    @Test
    void howManyWordsSpaceHyphen() {
        Assertions.assertEquals(4, person3.howManyWords(person3.surname));
    }
}
