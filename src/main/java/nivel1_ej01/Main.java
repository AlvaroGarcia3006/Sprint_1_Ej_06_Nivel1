package nivel1_ej01;

public class Main {
    public static void main(String[] args) {
        Team sporting = new Team("Sporting", "Gijón");
        Team barsa = new Team("Barça", "Barcelona");
        Team lakers = new Team("Lakers", "Los Ángeles");

        NoGenericMethods a = new NoGenericMethods(sporting, barsa, lakers);
        System.out.println(a);
        NoGenericMethods b = new NoGenericMethods(barsa, lakers, sporting);
        System.out.println(b);
        NoGenericMethods c = new NoGenericMethods(lakers, sporting, barsa);
        System.out.println(c);
    }
}
