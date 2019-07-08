public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Zaginiony symbol";
        book1.author ="Dan Brown";
        book1.pages = 568;

        System.out.println("Tytuł ksiązki: " + book1.name );
        System.out.println("Autor ksiązki: " + book1.author );
        System.out.println("Ilość stron: " + book1.pages );
    }
}
