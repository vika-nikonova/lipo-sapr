package geometry;

/**
 * Параллелепипед
 */
public final class Parallelepiped extends Figure3DBase {

    /**
     * Площадь основания параллелепипеда
     */
    private double _square;

    /**
     * Высота параллелепипеда
     */
    private double _height;

    /**
     * Конструктор по умолчанию
     */
    public Parallelepiped() {
        _square = 0;
        _height = 0;
    }

    /**
     * Параметризированный конструктор
     * @param newSquare Площадь основания параллелепипеда
     * @param newHeight Высота параллелепипеда
     */
    public Parallelepiped(double newSquare, double newHeight) {
        setSquare(newSquare);
        setHeight(newHeight);
    }

    /**
     * Устанавливает значение для поля _square
     * @param newSquare Площадь основания параллелепипеда
     */
    public void setSquare(double newSquare) {
        validateNonNegative(newSquare);
        _square = newSquare;
    }

    /**
     * Возвращает значение поля _square
     * @return Площадь основания параллелепипеда
     */
    public double getSquare() {
        return _square;
    }

    /**
     * Устанавливает значение поля _height
     * @param newHeight Высота параллелепипеда
     */
    public void setHeight(double newHeight) {
        validateNonNegative(newHeight);
        _height = newHeight;
    }

    /**
     * Возвращает значение поля _height
     * @return Высота параллелепипеда
     */
    public double getHeight() {
        return _height;
    }

    /**
     * Рассчитывает объем параллелепипеда
     * @return Объем параллелепипеда
     */
    @Override
    public double getVolume() {
        return this.getSquare() * this.getHeight();
    }

}
