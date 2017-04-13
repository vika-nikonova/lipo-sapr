package geometry;

/**
 * Шар
 */
public final class Sphere extends Figure3DBase {

    /**
     * Радиус шара
     */
    private double _radius;

    /**
     * Конструктор по умолчанию
     */
    public Sphere() {
        _radius  = 0;
    }

    /**
     * Параметризированный конструктор
     * @param newRadius Радиус шара
     */
    public Sphere(double newRadius) {
        setRadius(newRadius);
    }

    /**
     * Устанавливает значение поля _radius
     * @param newRadius Радиус шара
     */
    public void setRadius(double newRadius) {
        validateNonNegative(newRadius);
        _radius = newRadius;
    }

    /**
     * Возвращает значение поля _radius
     * @return Радиус шара
     */
    public double getRadius() {
        return _radius;
    }

    /**
     * Рассчет объема шара
     * @return Объем шара
     */
    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(this.getRadius(), 3)) / 3;
    }

}
