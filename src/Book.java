import java.util.Objects;
public class Book {
    private String bookName;
    private Author author;
    private int yearOfPublication;

    public Book(String bookName, Author author, int yearOfPublication) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;

    }


    @Override
    public String toString() {
        return "Название книги " + bookName + getAuthor() + " Год издания " + yearOfPublication;
    }

    @Override
    public boolean equals (Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return bookName.equals(getBookName());
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
}

