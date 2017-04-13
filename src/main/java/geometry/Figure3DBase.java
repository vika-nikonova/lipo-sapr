package geometry;

/**
 * Базовый класс для объемных фигур
 */
public abstract class Figure3DBase {

    /**
     * Рассчитать объем фигуры
     * @return Объем фигуры
     */
    public abstract double getVolume();

    /**
     * Валидация даных
     * @param value Валидируемое значение
     */
    protected void validateNonNegative(double value) throws ArithmeticException {
        if (value < 0)
            throw new ArithmeticException("Ошибка: устанавливаемое значение не может быть меньше 0");
    }

}
