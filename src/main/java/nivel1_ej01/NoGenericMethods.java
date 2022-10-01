package nivel1_ej01;

public class NoGenericMethods {
    private static Team a;
    private static Team b;
    private static Team c;
    public NoGenericMethods(Team a, Team b, Team c) {
        NoGenericMethods.a = a;
        NoGenericMethods.b = b;
        NoGenericMethods.c = c;
    }
    public static Team getA() {
        return a;
    }
    public static void setA(Team a) {
        NoGenericMethods.a = a;
    }
    public static Team getB() {
        return b;
    }
    public static void setB(Team b) {
        NoGenericMethods.b = b;
    }
    public static Team getC() {
        return c;
    }
    public static void setC(Team c) {
        NoGenericMethods.c = c;
    }
    public String toString(){
        return "[[Team A: "+a.toString()+"]]\n"+"[[Team B: "+b.toString()+"]]\n"+"[[Team C: "+c.toString()+"]]\n";
    }
}
