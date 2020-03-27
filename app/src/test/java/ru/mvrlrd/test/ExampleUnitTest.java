package ru.mvrlrd.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private Presenter presenter;


    @Before
    public void before() {
         presenter = new Presenter();
    }
    @Test
    public void sum_isCorrect() {
        int sum = presenter.aPlusB(3,5);
        Assert.assertEquals(0, sum);

    }

    @Test
    public void sum_isCorrect2() {
        int sum = presenter.aPlusB(7,5);
        Assert.assertEquals(12, sum);

    }
}

