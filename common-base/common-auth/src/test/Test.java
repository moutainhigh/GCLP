import com.grape.BootApplication;
import com.grape.controller.bean.FrontLogBean;
import com.grape.repository.entity.FrontLog;
import com.grape.repository.entity.Orders;
import com.grape.service.LogService;
import com.grape.service.OrderService;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @描述 :
 * @创建人 zyh
 * @创建时间 2018/4/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BootApplication.class)
public class Test {
    /*@Autowired
    public LogService logService;*/

    @Autowired
    public OrderService orderService;

    //JSONObject jsonObject = new JSONObject();

    @org.junit.Test
    public void test() throws IOException, ParseException {
        ObjectMapper objectMapper = new ObjectMapper();
        /*Page<FrontLog> list = logService.selectFrontLog(1,null,null,0,5);
        String a = objectMapper.writeValueAsString(list);
        System.out.println(a);*/

        /*Date date = new Date();
        SimpleDateFormat simpleTimeZone = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = simpleTimeZone.format(new Date());*/

      //Map<String, Object> result = orderService.selectCompanyOrder(12345, 1, null,0, date1, date1,null, null, null, 0, 5 );

        /*Integer result = orderService.addCompanyOrder(12345,1,"abc123457", "http://www.qq.com",
                                                            "测试会员添加订单","加单", BigDecimal.valueOf(99.99),BigDecimal.valueOf(5.00),BigDecimal.valueOf(1049.90),
                                                            "http://v.qq.com",null, 1, 10, 5,
                                                            "2018-04-23", 0, "很好 没有什么问题可以备注的了", 1,"123456");*/
        //System.out.println(result);
       /* Map<String,Object> map = orderService.selectCompanyOrderById(9);
        String result1 = objectMapper.writeValueAsString(map);
        System.out.println(result1);*/

        /*BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = encoder.encode("88888888");
        System.out.println(password);*/
    }
}
