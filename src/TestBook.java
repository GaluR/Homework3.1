public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Zaginiony symbol", "Dan Brown", 568);
        Book book2 = new Book("Wirus", "G. Del Toro", 346);
//        book1.name = "Zaginiony symbol";
//        book1.author ="Dan Brown";
//        book1.pages = 568;
//        book2.name = "Wirus";
//        book2.author = "G. Del Toro";
//        book2.pages = 346;

        System.out.println("Tytuł ksiązki: " + book1.name );
        System.out.println("Autor ksiązki: " + book1.author );
        System.out.println("Ilość stron: " + book1.pages );
        System.out.println("Tytuł ksiązki: " + book2.name );
        System.out.println("Autor ksiązki: " + book2.author );
        System.out.println("Ilość stron: " + book2.pages );
    }
}
