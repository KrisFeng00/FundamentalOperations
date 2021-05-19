package test.company;

import company.Controller;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Controller Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>5月 19, 2021</pre>
 */
public class ControllerTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: textCon(String str)
     */
    @Test
    public void testTextCon() throws Exception {
//TODO: Test goes here...

        Controller controller = new Controller();
        /**
         * */
        String array[] = {"a + 5", "1 ; 9", "1     - 5","1 + 6","5 - 8","-666 / 3","88 * -99"};
        String explain[] = {"输入带有字母的测试","输入带有非法符号的测试","输入带有多个空格的测试","加法基础测试","减法基础测试","除法基础测试","乘法基础测试"};
        for(int i = 0; i < array.length; i++){
            System.out.println(explain[i]);
            System.out.print(array[i] + " = ");
            controller.textCon(array[i]);
            System.out.println();
        }

    }
}
