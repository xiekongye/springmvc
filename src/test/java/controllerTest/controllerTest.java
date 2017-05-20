package controllerTest;

import com.xiekongye.controller.TestController;
import com.xiekongye.service.ITestService;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;

/**
 * Created by You on 2017/5/20.
 */
public class controllerTest extends TestCase {

    @Test
    public void testHelloWorldController(){
        ITestService testService = mock(ITestService.class);

        Assert.assertNotNull(testService);

        TestController testController = new TestController(testService);

        HashMap<String,Object> model = new HashMap<String, Object>();
        String viewName = testController.helloWorld(model);

        Assert.assertEquals("helloWorld",viewName);
    }
}
