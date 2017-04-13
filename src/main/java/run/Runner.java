package run;

import geometry.*;

/**
 * Запуск программы
 */
public class Runner {

    /**
     * Главный метод программы
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Parallelepiped parallelepiped = new Parallelepiped();
            parallelepiped.setHeight(2);
            parallelepiped.setSquare(2);
            System.out.println("Рассчет объема параллелепипеда: " + parallelepiped.getSquare() + " * " + parallelepiped.getHeight() + " = " + parallelepiped.getVolume());

            Pyramid pyramid = new Pyramid();
            pyramid.setHeight(2);
            pyramid.setSquare(3);
            System.out.println("Рассчет объема пирамиды: " + pyramid.getSquare() + " * " + pyramid.getHeight() + " / 3 = " + pyramid.getVolume());

            Sphere sphere = new Sphere();
            sphere.setRadius(-1);
            System.out.println("Рассчет объема шара с радиусом: " + sphere.getRadius() + " = " + sphere.getVolume());

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}