public class Person implements Comparable<Person> {
    protected String name;
    protected String surname;
    protected int age;


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + age + ")";
    }

    public int howManyWords(String surname) {
        int numberWords = 1;
        char[] symbols = surname.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == ' ' || symbols[i] == '-') {
                numberWords++;
            }
        }
        return numberWords;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
