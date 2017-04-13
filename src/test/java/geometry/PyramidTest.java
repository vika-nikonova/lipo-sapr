package geometry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.*;

/**
 * Тестирование класса Pyramid
 */
@RunWith(Parameterized.class)
public class PyramidTest {

    /**
     * Объект тестируемого класса Pyramid
     */
    private Pyramid pyramid = null;

    private double _squareTestData;
    private double _heightTestData;

    /**
     * Параметризированный конструктор
     * @param newSquareTestData Переменная для тестов (поле _square класса Pyramid)
     * @param newHeightTestData Переменная для тестов (поле _height класса Pyramid)
     */
    public PyramidTest (double newSquareTestData, double newHeightTestData) {
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
                {2, 2},
                {50, 60},
                {Double.MAX_VALUE, Double.MAX_VALUE},
                {Double.MIN_VALUE, Double.MIN_VALUE}
        });
    }

    /**
     * Выполняется перед каждым тестовым методом
     */
    @Before
    public void setUp() {
        pyramid = new Pyramid();
    }

    /**
     * Выполняется после каждого тестового метода
     */
    @After
    public void tearDown() {
        pyramid = null;
    }

    /**
     * Тестирование метода getSquare()
     */
    @Test
    public void testGetSquare() {
        System.out.println("testGetSquare: " + _squareTestData);
        pyramid.setSquare(_squareTestData);
        assertEquals(_squareTestData, pyramid.getSquare());
    }

    /**
     * Тестирование метода getHeight()
     */
    @Test
    public void testGetHeight() {
        System.out.println("testGetHeight: " + _heightTestData);
        pyramid.setHeight(_heightTestData);
        assertEquals(_heightTestData, pyramid.getHeight());
    }

    /**
     * Тестирование метода getVolume()
     */
    @Test
    public void testGetVolume() {
        System.out.println("testGetVolume: " + _squareTestData + ", " + _heightTestData);
        pyramid.setSquare(_squareTestData);
        pyramid.setHeight(_heightTestData);
        assertEquals((_squareTestData * _heightTestData / 3), pyramid.getVolume());
    }

}