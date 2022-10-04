public class Main {
    public static void main(String[] args) {

        System.out.println("Практика на уроке");
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        Person john = new Person("John", 18);

        System.out.println("Домашнее задание 1.9. Объекты и классы ");
        //В методе main создать несколько объектов Книга (достаточно двух)
        // и несколько объектов Автор (достаточно тоже двух) и инициализировать друг друга.
        // Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.

        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");

        Book fairytale = new Book("Сказка о рыбаке и рыбке",pushkin, 1835);
        Book fairytale2 = new Book("Три медведя", tolstoy, 1870);

        fairytale.bookPrint();
        fairytale2.bookPrint();

        fairytale2.setYear(1875);
        fairytale2.bookPrint();

    }
}