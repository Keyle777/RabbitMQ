package fun.keyle.RabbitMQ;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitMqApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    void testhelloworld() {
        //第一个参数：发送的队列 第二个参数： 发送的信息
        rabbitTemplate.convertAndSend("hellosr","hello spring boot rabbitmq");
    }

}
