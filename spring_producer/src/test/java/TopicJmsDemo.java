import com.itheima.demo.QueueProducer;
import com.itheima.demo.TopicProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring/applicationContext-jms-producer.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TopicJmsDemo {
    @Autowired
    private TopicProducer topicProducer;
    @Test
    public void test(){
        topicProducer.sendTextMessage("哈哈我是发布订阅topic对topic");
    }
}

