public class NonVoidMethod {
    public String Nama() {
        String nama = "Donny";
        return nama;
    }

    public String NIM() {
        String nim = "L200183161";
        return nim;
    }

    public static void main(String[] args) {
        NonVoidMethod nonvoidmethod = new NonVoidMethod();
        System.out.println("Nama : " + nonvoidmethod.Nama());
        System.out.println("NIM : " + nonvoidmethod.NIM());
    }
}