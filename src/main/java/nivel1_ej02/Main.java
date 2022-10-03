package nivel1_ej02;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Álvaro", "García", 31);
        String st = "GenericMethods ha recibido un String";
        int i = 288;

        GenericMethods<Persona, String, Integer> example1 = new GenericMethods<>(p, st, i);
        System.out.println(example1.toString());
        GenericMethods<String, Integer, Persona> example2 = new GenericMethods<>(st, i, p);
        System.out.println(example2.toString());
        GenericMethods<Integer, Persona, String> example3 = new GenericMethods<>(i, p, st);
        System.out.println(example3.toString());
    }
}
