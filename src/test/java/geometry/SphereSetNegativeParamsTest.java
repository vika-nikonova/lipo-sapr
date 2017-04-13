package geometry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Класс для проведения негативного тестирования
 */
@RunWith(Parameterized.class)
public class SphereSetNegativeParamsTest {

    /**
     * Объект тестируемого класса Sphere
     */
    private Sphere sphere = null;

    private double _radiusTestData;

    /**
     * Параметризированный конструктор
     * @param radiusTestData Переменная для тестов (поле _radius класса Sphere)
     */
    public SphereSetNegativeParamsTest(double radiusTestData) {
        _radiusTestData = radiusTestData;
    }

    /**
     * Возвращает коллекцию параметров для проведения тестирования (тест кейсы)
     * @return Коллекция параметров
     */
    @Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][] {
                {-2},
                {-50},
                {Double.NEGATIVE_INFINITY}
        });
    }

    /**
     * Выполняется перед каждым тестовым методом
     */
    @Before
    public void setUp() {
        sphere = new Sphere();
    }

    /**
     * Выполняется после каждого тестового метода
     */
    @After
    public void tearDown() {
        sphere = null;
    }

    /**
     * Тестирование метода setRadius() на присвоение отрицательных значений
     */
    @Test(expected = ArithmeticException.class)
    public void testSetRadiusNegative() {
        System.out.println("testSetRadiusNegative: " + _radiusTestData);
        sphere.setRadius(_radiusTestData);
    }

}