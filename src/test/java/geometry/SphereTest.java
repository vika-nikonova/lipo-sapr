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
 * Тестирование класса Sphere
 */
@RunWith(Parameterized.class)
public class SphereTest {

    /**
     * Объект тестируемого класса Sphere
     */
    private Sphere sphere = null;

    private double _radiusTestData;

    /**
     * Параметризированный конструктор
     * @param radiusTestData Переменная для тестов (поле _square класса Sphere)
     */
    public SphereTest (double radiusTestData) {
        _radiusTestData = radiusTestData;
    }

    /**
     * Возвращает коллекцию параметров для проведения тестирования (тест кейсы)
     * @return Коллекция параметров
     */
    @Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][] {
                {2},
                {50},
                {Double.MAX_VALUE},
                {Double.MIN_VALUE}
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
     * Тестирование метода getRadius()
     */
    @Test
    public void testGetRadius() {
        System.out.println("testGetRadius: " + _radiusTestData);
        sphere.setRadius(_radiusTestData);
        assertEquals(_radiusTestData, sphere.getRadius());
    }

    /**
     * Тестирование метода getVolume()
     */
    @Test
    public void testGetVolume() {
        System.out.println("testGetVolume: " + _radiusTestData);
        sphere.setRadius(_radiusTestData);
        assertEquals((4 * Math.PI * Math.pow(_radiusTestData, 3)) / 3, sphere.getVolume());
    }

}