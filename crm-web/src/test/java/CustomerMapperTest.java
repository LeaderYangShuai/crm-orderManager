import edu.ccut.cn.domain.Customer;
import edu.ccut.cn.mapper.CustomerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @ProjectName: crm
 * @ClassName: CustomerMapperTest
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-09 18:08
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CustomerMapperTest {

    @Resource
    private CustomerMapper customerMapper;

    @Test
    public  void testSave(){
        Customer customer = new Customer();
        customer.setId("2");
        customer.setAge("13");
        customer.setGender("nan");
        customer.setUsername("bing");
        customerMapper.save(customer);

    }
}
