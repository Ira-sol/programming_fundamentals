package Library;



    class Author {
    private String name;
    private String email;
    private String nationality;

    public Author(String name, String email, String nationality) {
        this.name = name;
        this.email = email;
        this.nationality = nationality;

    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getNationality() {
        return nationality;
    }
    @Override
    public String toString() {
        return "Author: " + name + ", " + email + ", " + nationality;
    }
}
class Book {
    private String title;
    private double price;
    private Author author;

    public Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book: " + title + ", Price $" + price + "\n" + author.toString();
    }
}

public class Library {
    public static void main(String[] args) {
        Author author = new Author("J.K Rowling", "jrowling@gmail.com", "British");
        Book book = new Book("Harry Potter and the Philosopher's Stone", 19.99, author);

        System.out.println(book);
    }
}

