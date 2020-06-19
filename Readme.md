![1576320025806](Readme_img/1576320025806.png)

* 默认登录http://localhost:8080/carpenter_ChatRoom/login.jsp

  ![1576312909156](Readme_img/1576312909156.png)

## 第一阶段

* login.jsp发送Ajax请求，请求LoginServlet

  ![1576312992594](Readme_img/1576312992594.png)

* 登录判断，如果成功从login.jsp转到chat.jsp

  ![1576313011856](Readme_img/1576313011856.png)

* chat.jsp中包含了js脚本

  ![1576313064920](Readme_img/1576313064920.png)

## 第二阶段

* chat.jsp的body 加载完毕后触发一个ws.js文件中的方法 startWebSocket

  ![1576313597105](Readme_img/1576313597105.png)

  ![1576313653370](Readme_img/1576313653370.png)

  * 链接开启/关闭过程中会触发

  ![1576313853562](Readme_img/1576313853562.png)

* 向以上地址发送WebSocket请求，WebSocket服务

  ![1576313826401](Readme_img/1576313826401.png)

* 触发OnOpen方法![1576314062745](Readme_img/1576314062745.png)

## 第三阶段

* 



