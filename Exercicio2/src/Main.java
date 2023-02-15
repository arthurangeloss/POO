public class Main {
    public static void main(String[] args) {

        int x=10;
        int y = 0, w, z;
        y++;
        z=x++;
        w=++x;

        System.out.println("Valor da variavel y " + y);
        System.out.println("Valor da variavel z " + z);
        System.out.println("Valor da variavel x " + x);
        System.out.println("Valor da variavel w " + w);
    }
}
