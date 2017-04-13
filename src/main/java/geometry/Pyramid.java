package geometry;

/**
 * Пирамида
 */
public final class Pyramid extends Figure3DBase {

    /**
     * Площадь основания пирамиды
     */
    private double _square;

    /**
     * Высота пирамиды
     */
    private double _height;

    /**
     * Конструктор по умолчанию
     */
    public Pyramid() {
        _square = 0;
        _height = 0;
    }

    /**
     * Параметризированный конструктор
     * @param newSquare Площадь основания пирамиды
     * @param newHeight Высота пирамиды
     */
    public Pyramid(double newSquare, double newHeight) {
        setSquare(newSquare);
        setHeight(newHeight);
    }

    /**
     * Устанавливает значение для поля _square
     * @param newSquare Площадь основания пирамиды
     */
    public void setSquare(double newSquare) {
        validateNonNegative(newSquare);
        _square = newSquare;
    }

    /**
     * Возвращает значение поля _square
     * @return Площадь основания пирамиды
     */
    public double getSquare() {
        return _square;
    }

    /**
     * Устанавливает значение для поля _height
     * @param newHeight Высота пирамиды
     */
    public void setHeight(double newHeight) {
        validateNonNegative(newHeight);
        _height = newHeight;
    }

    /**
     * Возвращает значение поля _height
     * @return Высота пирамиды
     */
    public double getHeight() {
        return _height;
    }

    /**
     * Рассчет объема пирамиды
     * @return Объем пирамиды
     */
    @Override
    public double getVolume() {
        return this.getSquare() * this.getHeight() / 3;
    }
}
