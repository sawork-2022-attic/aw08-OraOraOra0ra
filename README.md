# aw08

Run the project with `mvn spring-boot:run` and send request to `http://localhost:8080/check`. You should see an reponses in json format like the following.

```json
{
    "icon_url": "https://assets.chucknorris.host/img/avatar/chuck-norris.png",
    "id": "kswv7NIaTCaIIErlBzODaA",
    "url": "https://api.chucknorris.io/jokes/kswv7NIaTCaIIErlBzODaA",
    "value": "Chuck Norris's shadow weighs 250 pounds and can kick your ass ."
}
```

Try to understand the provided code which demonstrates spring integration between a spring boot application with an externel http service (https://api.chucknorris.io/jokes/random).

Please implement delivery as an standalone service (just like the random joke service). Refer the sample code to integrate your Micropos system with delivery service so that user can check delivery status on Miropos which actually forwards user request to delivery service on demand.

![](Micropos.svg)

Consider the advantage by doing so and write it down in your readme file.



------

在gateway中使用IntergrationFlow创建inGate与outGate两模块通过自建channel进行通信。inGate将网关响应的http请求放入channel中，outGate再从中提取消息转发请求，同时为了传递路径信息将参数放入消息的payload中以供提取构造uri访问。

 使用异步相应的消息驱动spring-integration框架，使用时可以自由添加自定义操作，提供了更好的系统可扩展性、可靠性；组件间的低耦合性得到提升， 通过组装调配组件可以完成更复杂的功能。