异步消息用于系统间通讯，异步消息不关心接收者处理，返回，及消息是否发送成功

1.点对点
消息发送者发送消息时，将消息交给消息代理。由消息代理放入队列。当有接收者接收消息。消息从消息队列取出，传递给接收者。
点对点只保证每一条消息有唯一的发送者和接收者

2.发布/订阅
发布消息者发送消息，由多个接收者订阅消息。

jms(java message service)基于jvm消息代理规范，ActiveMQ,HornetQ是jms的实现。
AMQP(advance message queuing protocol)消息代理规范，兼容jms并且支持跨语言和平台，实现由RabbitMQ


activemq连接属性
spring.activemq.broker-url=tcp://localhost:61616 #消息代理路径
spring.activemq.user=
spring.activemq.password=
spring.activemq.in-memory=true
spring.activemq.pooled=false
