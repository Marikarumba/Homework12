import java.util.Objects;

public class Author {

    public String nameAuthor;
    public String surnameAuthor;

    public Author (String name, String surname) {
        this.nameAuthor = name;
        this.surnameAuthor = surname;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor() {
        return  this.surnameAuthor;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(surnameAuthor, author.surnameAuthor);
    }


    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }

    public String toString() {
        return  this.nameAuthor + " " + this.surnameAuthor;


    }
}
