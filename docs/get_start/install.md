# Java 安装

`Java` 现在版本众多，一改以往的`老态龙钟`形象；将每两年发布一个版本的周期缩短到半年。


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


在终端输入：

```shell
mvn -v
```

![](https://tva1.sinaimg.cn/large/008i3skNly1gs6fbftbs3j31ig0d4x67.jpg)

能够打印出系统信息表示安装成功。


# IDE 安装

`IDE(Integrated Development Environment)`是集成开发环境的简写，它将我们开发过程中大部分需要的工具整合起来，最终提供开发效率的一个工具。


这里推荐使用 `jetbrains` 公司开发 `IDEA`。

下载链接：

[https://www.jetbrains.com/idea/download/#section=windows](https://www.jetbrains.com/idea/download/#section=windows)

![](https://tva1.sinaimg.cn/large/008i3skNly1gs6ffokb58j31n00ou41p.jpg)
直接安装社区版完全足够了。

# Git 安装

`Git` 是一个版本控制软件，可以方便的管理我们代码的版本已经获取他人的代码。

下载链接:
[https://npm.taobao.org/mirrors/git-for-windows/v2.32.0.windows.1/Git-2.32.0-64-bit.exe](https://npm.taobao.org/mirrors/git-for-windows/v2.32.0.windows.1/Git-2.32.0-64-bit.exe)

![](https://tva1.sinaimg.cn/large/008i3skNly1gs6g1jwzlrj319q0qqdls.jpg)

安装完成后打开 `Git Bash` 软件，输入：

```shell
git --version
```
能够正确输出版本即可。


# 下载代码

在磁盘合适的地方新建一个目录，打开 `Git Bash` 利用 `cd 目录地址` 进入到刚才那个目录，接着输入

```shell
git@github.com:crossoverJie/java-noob.git
```

运行之后等待代码下载完成。


## 导入 IDE

接着代开 `IDEA`，在左上角选择 `Open or Import`，打开刚才下载代码目录。
![](https://tva1.sinaimg.cn/large/008i3skNly1gs6g9msclwj31760qsn1e.jpg)

等待大概 1min ，进度条走完。

![](https://tva1.sinaimg.cn/large/008i3skNly1gs6gbsa6lmj30zm0a4q3p.jpg)

找到这个 HelloWorld 文件打开，点击运行按钮等待`编译、运行`后会在控制台打印运行结果：

![](https://tva1.sinaimg.cn/large/008i3skNly1gs6gd1vk9cj30vi0ba0vx.jpg)

![](https://tva1.sinaimg.cn/large/008i3skNly1gs6gdb5i05j30y2054wez.jpg)

当看到这几个字母打印出来后，恭喜你！万里长征第一步开始了。

---
接着可以尝试修改

```java
System.out.println("hello world");
```

这段话的输出内容，比如：

```java
System.out.println("hello new world");
```

再运行后观察效果。


> 下一章节我们尝试用一个例子来学习基本的基础语法与常用基础类型(`int/String/double/`)，敬请期待。


# 课后练习

通过以下链接预习下节课的有关内容：


[https://www.runoob.com/java/java-basic-syntax.html](https://www.runoob.com/java/java-basic-syntax.html)

[https://www.runoob.com/java/java-basic-datatypes.html](https://www.runoob.com/java/java-basic-datatypes.html)


### 参考资料

[https://www.runoob.com/java/java-environment-setup.html](https://www.runoob.com/java/java-environment-setup.html)

[https://www.runoob.com/maven/maven-setup.html](https://www.runoob.com/maven/maven-setup.html)

[https://www.runoob.com/git/git-install-setup.html](https://www.runoob.com/git/git-install-setup.html)

[https://zh.wikipedia.org/wiki/Java%E7%89%88%E6%9C%AC%E6%AD%B7%E5%8F%B2#Java_SE_16](https://zh.wikipedia.org/wiki/Java%E7%89%88%E6%9C%AC%E6%AD%B7%E5%8F%B2#Java_SE_16)