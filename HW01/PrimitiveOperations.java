class PrimitiveOperations {
    public static void main (String [] args) {
        int x = 2;
        double y = 3.45;
        System.out.println(x);
        System.out.println(y);
        double result = x * y;
        System.out.println(result);
        double z = (double)x;
        System.out.println(z);
        int a = (int)y;
        System.out.println(a);
        char letter = 'A';
        System.out.println((char)((int)letter + 32));
    }
}