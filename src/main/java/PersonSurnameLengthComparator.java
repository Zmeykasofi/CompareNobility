import java.util.Comparator;

public class PersonSurnameLengthComparator implements Comparator<Person> {
    protected int maxNumberWords;
    public PersonSurnameLengthComparator(int maxNumberWords) {
        this.maxNumberWords = maxNumberWords;
    }
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.howManyWords(o1.surname) <= maxNumberWords && o2.howManyWords(o2.surname) <= maxNumberWords) {
            if (o1.howManyWords(o1.surname) < o2.howManyWords(o2.surname)) {
                return -1;
            } else if (o1.howManyWords(o1.surname) > o2.howManyWords(o2.surname)) {
                return 1;
            }
        }
        return Integer.compare(o1.age, o2.age);
    }
}
