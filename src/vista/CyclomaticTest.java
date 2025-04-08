/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author campv
 */
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
        cyclomaticTest(1); // Puedes cambiar el valor aquí para probar distintos casos
    }
}
