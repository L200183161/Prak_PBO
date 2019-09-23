public class StaticVariable {
    public static char akreditasi;
    public static final String jurusan = "Informatika";

    void firstMethod() {
        System.out.println(jurusan);
    }

    void secondMethod() {
        System.out.println("Akreditasi : " + akreditasi );
    }
}
