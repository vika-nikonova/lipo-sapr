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
 * Тестирование класса Parallelepiped
 */
@RunWith(Parameterized.class)
public class ParallelepipedTest {

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
    public ParallelepipedTest(double newSquareTestData, double newHeightTestData) {
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
     * Тестирование метода getSquare()
     */
    @Test
    public void testGetSquare() {
        System.out.println("testGetSquare: " + _squareTestData);
        parallelepiped.setSquare(_squareTestData);
        assertEquals(_squareTestData, parallelepiped.getSquare());
    }

    /**
     * Тестирование метода getHeight()
     */
    @Test
    public void testGetHeight() {
        System.out.println("testGetHeight: " + _heightTestData);
        parallelepiped.setHeight(_heightTestData);
        assertEquals(_heightTestData, parallelepiped.getHeight());
    }

    /**
     * Тестирование метода getVolume()
     */
    @Test
    public void testGetVolume() {
        System.out.println("testGetVolume: " + _squareTestData + ", " + _heightTestData);
        parallelepiped.setSquare(_squareTestData);
        parallelepiped.setHeight(_heightTestData);
        assertEquals(_squareTestData * _heightTestData, parallelepiped.getVolume());
    }

}