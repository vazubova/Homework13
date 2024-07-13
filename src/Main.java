public class Main {

    public static void main(String[] args) {

        Author firstBookAuthor = new Author("Nikolay", "Gogol");
        Author secondBookAuthor = new Author("Fedor", "Dostoevski");
        Book one = new Book("Nose", firstBookAuthor, 1836);
        Book two= new Book ("Idiot", secondBookAuthor, 1869);
        System.out.println (one);
        System.out.println(two);
        one.setYearOfPublication(1833);
        System.out.println(one);
        System.out.println(firstBookAuthor.equals(secondBookAuthor));


    }
}