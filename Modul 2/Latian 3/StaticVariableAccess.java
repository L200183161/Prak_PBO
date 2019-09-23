public class StaticVariableAccess {
    public static void main(String[] args) {
        StaticVariable.akreditasi = 'B';
        StaticVariable sv = new StaticVariable();
        sv.firstMethod();
        sv.secondMethod();
    }
}
