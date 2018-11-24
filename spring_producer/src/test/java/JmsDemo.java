import com.itheima.demo.QueueProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring/applicationContext-jms-producer.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class JmsDemo {
    @Autowired
    private QueueProducer queueProducer;
    @Test
    public void test(){
        queueProducer.sendTextMessage("哈哈我是点对点queue对queue");
    }
}

