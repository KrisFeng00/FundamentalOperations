package test.company;

import company.Service;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


import java.security.Provider;
import java.util.Random;

/**
* company.Service Tester.
*
* @author <Authors name>
* @since <pre>5月 19, 2021</pre>
* @version 1.0
*/
public class ServiceTest {
    Service service = new Service();
@Before
public void before() throws Exception {
}

@After
public void after() throws Exception {
}

/**
*
* Method: plus(int num1, int num2)
*
*/
@Test
public void testPlus() throws Exception {
    for(int i = 0 ; i < 10 ;i++){
        int num1 = (int)(Math.random() * (-5000) + 2500) ;
        int num2 = (int)(Math.random() * (-5000) + 2500) ;
        int result = service.plus(num1,num2);
        System.out.println(num1 +" + " + num2 +" = "+result);
    }
}

/**
*
* Method: minus(int num1, int num2)
*
*/
@Test
public void testMinus() throws Exception {
//TODO: Test goes here...
    for(int i = 0 ; i < 10 ;i++){
        int num1 = (int)(Math.random() * (-5000) + 2500) ;
        int num2 = (int)(Math.random() * (-5000) + 2500) ;
        int result = service.minus(num1,num2);
        System.out.println(num1 +" - " + num2 +" = "+result);
    }
}

/**
*
* Method: times(int num1, int num2)
*
*/
@Test
public void testTimes() throws Exception {
//TODO: Test goes here...

    for(int i = 0 ; i < 10 ;i++){
        int num1 = (int)(Math.random() * (-5000) + 2500) ;
        int num2 = (int)(Math.random() * (-5000) + 2500) ;
        int result = service.times(num1,num2);
        System.out.println(num1 +" * " + num2 +" = "+result);
    }
}

/**
*
* Method: divide(int num1, int num2)
*
*/
@Test
public void testDivide() throws Exception {
//TODO: Test goes here...

    for(int i = 0 ; i < 10 ;i++){
        int num1 = (int)(Math.random() * (-5000) + 2500) ;
        int num2 = (int)(Math.random() * (-5000) + 2500) ;
        int result = service.divide(num1,num2);
        System.out.println(num1 +" / " + num2 +" = "+result);
    }
}


}
