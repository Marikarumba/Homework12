import java.util.Objects;

public class Book {

    // данные об имени, авторе и годе публикации.
    // Типы полей должны быть String, Author  и int.

    public String bookName;
    public Author authorName;

    public int year;

    public Book(String book, Author aName, int year){
        this.bookName = book;
        this.authorName = aName;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public String getAuthorFullName() {
        return authorName.getNameAuthor()+" "+authorName.getSurnameAuthor();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void bookPrint(){
        System.out.printf("%n Название:%s%n Автор:%s%n Год издания:%s%n",
                this.getBookName(),this.getAuthorFullName(), this.getYear());
    }

    public String toString() {
        return  this.bookName + " " + this.authorName + this.year;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    public int hashCode() {
        return Objects.hash(bookName, authorName, year);
    }
}

