package nivel1_ej02;

public class GenericMethods<T, U, K>{
    private T tValue;
    private U uValue;
    private K kValue;
    public GenericMethods(T tValue, U uValue, K kValue) {
        this.tValue = tValue;
        this.uValue = uValue;
        this.kValue = kValue;
    }
    public T gettValue() {
        return tValue;
    }
    public void settValue(T tValue) {
        this.tValue = tValue;
    }
    public U getuValue() {
        return uValue;
    }
    public void setuValue(U uValue) {
        this.uValue = uValue;
    }
    public K getkValue() {
        return kValue;
    }
    public void setkValue(K kValue) {
        this.kValue = kValue;
    }
    @Override
    public String toString() {
        return "GenericMethods{" +
                "tValue=" + tValue +
                ", uValue=" + uValue +
                ", kValue=" + kValue +
                '}';
    }
}
