package vista;

public class CyclomaticTest {
    public static void cyclomaticTest(int a) {
        switch (a) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("many");
                break;
            default:
                System.out.println("lots");
                break;
        }
    }

    public static void main(String[] args) {
        cyclomaticTest(3); // Puedes cambiar el valor aquí para probar distintos casos
    }
}
