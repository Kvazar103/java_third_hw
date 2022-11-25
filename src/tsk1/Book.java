package tsk1;

public class Book implements Printable{
    private String name;
    private int pages;
    private Genre genre;

    public Book(String name, int pages, Genre genre) {
        this.name = name;
        this.pages = pages;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", genre=" + genre +
                '}';
    }
}
