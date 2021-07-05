# Java 安装

Java 现在版本众多，一改以往的`老态龙钟`形象；将每两年发布一个版本的周期缩短到半年。


![](https://tva1.sinaimg.cn/large/008i3skNly1gs6cw7ufdhj60hq09baay02.jpg)


但官方真正长期支持的版本依然是两年发布一版，所以我们更推荐使用 `LTS(长期支持版)` 版本进行开发学习。

在 `2021` 这个时间节点，更推荐使用 JDK11；不做特殊声明时本文的所有代码都运行与 `JDK11` 平台之上。

下载链接：

[https://www.oracle.com/java/technologies/javase-jdk11-downloads.html](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

![](https://tva1.sinaimg.cn/large/008i3skNly1gs6evom7toj30sk124n39.jpg)
下载时如果提示没有登录，没有账户可以注册一个。

具体安装流程可以参考这里：

[https://www.runoob.com/java/java-environment-setup.html](https://www.runoob.com/java/java-environment-setup.html)

最终在终端输入
```java
java -version
```
出现以下内容代表安装成功。
![](https://tva1.sinaimg.cn/large/008i3skNly1gs6ezxqswwj315i07stll.jpg)

# Maven 安装

`maven` 作为 Java 打包工具中的常青树🌲，虽说近几年有被 `gradle` 赶超的趋势，但目前依然是打包工具份额的 `NO.1`。

现阶段不用过于纠结 `maven` 是拿来做什么的，可以简单将其理解为将 `Java` 程序打包成一个可执行程序的工具，没有它也行，但最终使用起来会比较麻烦。

下载链接：

[http://maven.apache.org/download.cgi](http://maven.apache.org/download.cgi)

下载解压保存在一个目录后，记住当前地址。

> 建议在某个磁盘单独新增一个目录用于存放后续开发需要安装的文件。

最后参考这里配置好环境变量：

![](https://tva1.sinaimg.cn/large/008i3skNly1gs6faai71lj316j0u00zi.jpg)


在终端输入

```shell
mvn -v
````

![](https://tva1.sinaimg.cn/large/008i3skNly1gs6fbftbs3j31ig0d4x67.jpg)

能够打印出系统信息表示安装成功。


# IDE 安装








### 参考资料

[https://www.runoob.com/java/java-environment-setup.html](https://www.runoob.com/java/java-environment-setup.html)
[https://www.runoob.com/maven/maven-setup.html](https://www.runoob.com/maven/maven-setup.html)