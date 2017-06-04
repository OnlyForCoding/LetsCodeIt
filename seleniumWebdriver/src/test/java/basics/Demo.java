package basics;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by dell on 11/5/17.
 */
public class Demo {

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }

    @Test
    public void a(){
        System.out.println("in a()");
    }

    @Test
    public void b(){
        System.out.println("in b()");
    }

    @Test
    public void c(){
        System.out.println("in c()");
    }

    @Test
    public void d(){
        System.out.println("in d()");
    }
}
