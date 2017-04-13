package geometry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Класс для проведения негативного тестирования
 */
@RunWith(Parameterized.class)
public class ParallelepipedSetNegativeParamsTest {

    /**
     * Объект тестируемого класса Parallelepiped
     */
    private Parallelepiped parallelepiped = null;

    private double _squareTestData;
    private double _heightTestData;

    /**
     * Параметризированный конструктор
     * @param newSquareTestData Переменная для тестов (поле _square класса Parallelepiped)
     * @param newHeightTestData Переменная для тестов (поле _height класса Parallelepiped)
     */
    public ParallelepipedSetNegativeParamsTest(double newSquareTestData, double newHeightTestData) {
        _squareTestData = newSquareTestData;
        _heightTestData = newHeightTestData;
    }

    /**
     * Возвращает коллекцию параметров для проведения тестирования (тест кейсы)
     * @return Коллекция параметров
     */
    @Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][] {
                {-2, -2},
                {-50, -60},
                {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY}
        });
    }

    /**
     * Выполняется перед каждым тестовым методом
     */
    @Before
    public void setUp() {
        parallelepiped = new Parallelepiped();
    }

    /**
     * Выполняется после каждого тестового метода
     */
    @After
    public void tearDown() {
        parallelepiped = null;
    }

    /**
     * Тестирование метода setSquare() на присвоение отрицательных значений
     */
    @Test(expected = ArithmeticException.class)
    public void testSetSquareNegative() {
        System.out.println("testSetSquareNegative: " + _squareTestData);
        parallelepiped.setSquare(_squareTestData);
    }

    /**
     * Тестирование метода setHeight() на присвоение отрицательных значений
     */
    @Test(expected = ArithmeticException.class)
    public void testSetHeightNegative() {
        System.out.println("testSetHeightNegative: " + _heightTestData);
        parallelepiped.setHeight(_heightTestData);
    }

}