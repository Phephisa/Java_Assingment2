public class q3 {
    public static void main(String[] args) {
        compute(2, 9);
        compute("word");
    }

    // a
    public static void compute(int a, int b) {

        int product = a * b;
        System.out.println(product);
    }

    // b
    public static void compute(String wrd) {

        int length = wrd.length();
        System.out.println(length + "   " + wrd.toUpperCase());
    }
}
