# 程序基本结构
```java
package org.noob.install;
/**
 * Function:这里是注释
 *
 * @author crossoverJie
 * Date: 2021/7/5 22:39
 * @since JDK 11
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}

```

以上一节的代码为例来分析下这个最小的 Java 程序是如何组成的。

## package

第一行的 `package org.noob.install;` 是用于声明该程序所处的位置，可以类比于文件夹的作用，将不同的文件按需分类。


由于这里只有一个文件，所以暂时还看不出 `package` 的作用，后续写复杂应用时就能体会其中的好处了。

## 注释

接着是以 `/**` 开头 `*/` 结尾的一段文本，其中的内容理论可以任意填写，`Java 编译器（后续会介绍）`并不会做任何干预。

通常是用于编写该程序的备注信息，当然也会有一些约定性质的写法。

比如这里的 ` * @author` 就是拿来备注作者信息的，通过一些工具可以将这些注释中的关键信息提取出来形成一份文档，他人可以通过这份文档就能知道这个程序的大体信息。


## 代码

![](https://tva1.sinaimg.cn/large/008i3skNly1gsvzf1yntoj30x60u0q7c.jpg)

上图则是日常最常接触到的代码部分。

通常代码的书写与阅读方式都是从上至下，从左至右。

所以首先看到的应该是`public class HelloWorld`，翻译过来就是声明了一个公开访问的 `HelloWorld` 类。

> 访问修饰符还有 `private protected default` 最常用的是 `public/private` ，后续会介绍。

这里的 `class` 是一个关键字，用于声明一个类；类是一个非常重要的概念，后续在介绍面向对象时会具体分析。


往下看`public static void main(String[] args)` 是一段方法声明。

在 Java 中约定 main 方法作为程序的入口；同时写法一定得是 `public static void main(String[] args)` 这里的 `args` 名称不做强制要求。

> 入口：可以认为启动该程序时首先需要执行的方法。


## 程序逻辑

`System.out.println("hello world");`就是该程序的执行逻辑，当然这里只是简单的打印数据。

程序逻辑也满足从上到下的执行规则：

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("nice to meet you");
    }
}
```

比如这样就会先打印 `hello world` 再打印 `nice to meet you`.




# 基础数据类型

## 整形

# 字符串
