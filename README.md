# 我的Java学习笔记

by元子 2021年10月1日


# ![img](http://yuanzigsa.com/wp-content/uploads/2021/10/tidfdds-1024x851.jpg)

# Chapter1：初始Java



#### 基本认识

- 类（Class）：java世界中的一类物体

- 方法（Method）：物体的功能

- main（）方法：所有java程序执行的起点



#### JDK、JRE、JVM三者的区别与联系

**区别**

- JVM(Java Virtual Machine):java 虚拟机，用于保证 java 的跨平台的特性。java 语言是跨平台， jvm 不是跨平台的。

- JRE(Java Runtime Environment):java 的运行环境 ,包括 jvm+java 的核心类库。

- JDK(Java Development Kit):java 的开发工具 ,包括 jre+开发工具

  *PS：*

  *bin:最主要的是编译器(javac.exe)*
  *include:java和JVM交互用的头文件*
  *lib:类库*
  *jre:java运行环境*

**联系**

- JDk包含JRE，JDK 和 JRE 中都包含 JVM

- Java 喊出的带有标志性的口号“ Write Once ， Run Anywhere （一次编写，到处运行）”，正是建立在 JRE 的基础-之上。何以实现？就是在 Java 应用程序和操作系统之间增加了一虚拟层—— JRE 。



#### 环境变量 path 和 classpath 的作用

- path 是配置 Windows 可执行文件的搜索路径，即扩展名为 .exe 的程序文件所在的目

录，用于指定 DOS 窗口命令的路径。

- Classpath 是配置 class 文件所在的目录， 用于指定类搜索路径， JVM 就是通过它来寻

找该类的 class 类文件的。



#### 变量有什么用？为什么要定义变量？什么时候用？

- 变量的作用：用来存储数据。

- 为什么要定义变量：用来不断的存放同一类型的常量，并可以重复使用



#### & 和&& 的区别

- && 会出现短路，如果可以通过第一个表达式判断出整个表达式的结果，则不

继续后面表达式的运算；只能操作 boolean 类型数据；

- &不会出现短路， 将整个表达式都运算。 既可以操作 boolean 数据还可以操作

数。



#### 标示符命名规则

- 由数字 (0-9)，大小写英文字母，以及 _和$组成。
- 不能以数字开头。
- 不能使用关键字来自定义命名。



#### 数据类型

​	**基本数据类型 (4 类 8 种)**

- 整数类型： byte、short、int、long

- 浮点数类型： float 、double

- 字符类型： char

- 布尔类型： boolean(ture false)

​	**引用数据类型**

- 类

- 接口

- 数组



#### 类型转换

​	**精度从高到低 double	float	long 	int 	short(char) 	byte**

- 自动类型转换 将一个低精度 ---

- 强制类型转换 将一个高精度 --- (精度会下降 )



#### java 语言的三种技术架构

​	**J2EE：企业版**

​	是为开发企业环境下的应用程序提供的一套解决方案。该技术体系中包含的技术如 Servlet、Jsp 等，主要针对对于 Web 应用程序开发。

​	**J2SE：标准版**

​	是为开发普通桌面和商务应用程序提供的解决方案。该技术体系是其他两者的基础，可以完成一些桌面应用程序的开发。比如 Java 版的扫雷。

​	**J2ME：小型版**

​	是为开发电子消费产品和嵌入式设备提供的解决方案。该技术体系主要应用于小型电子消费类产品，如手机中的应用程序等。



#### 函数

​	**定义**

​	函数就是定义在类中的具有特定功能的一段独立小程序。

​	**特点**

- 定义函数可以将功能代码进行封装

- 便于对该功能进行复用

- 函数只有被调用才会被执行

- 函数的出现提高了代码的复用性

- 对于函数没有具体返回值的情况，返回值类型用关键字 void 表示，那么该函数中的 return 语句如果在最后一行可以省略不写

  **函数的应用两个明确**

  明确要定义的功能最后的结果是什么

  明确在定义该功能的过程中，是否需要未知内容参与运算



#### 重载

​	**概念：** 在同一个类中， 允许存在一个以上的同名函数， 只要它们的参数个数或者参数类型不同即可。

​	**特点：** 与返回值类型无关，只看参数列表 (参数类型以及参数个数 )。

​	**好处：** 方便于阅读，优化了程序设计。



#### 数组

​	**概念：** 同一种数据类型的集合。

​	**好处：** 可以自动给数组中的元素从 0 开始编号，方便操作这些元素。



#### 内存结构

​	**栈内存：** 用于存储局部变量，当数据使用完，所占空间会自动释放。

​	**堆内存：** 数组和对象，通过 new 建立的实例都存放在堆内存中。

​	**方法区：** 静态成员、构造函数、常量池、线程池

​	**本地方法区：** window 系统占用

​	**寄存器：**



# Chapter2：面向对象

```java
package Method;

public class TestReturnValue {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.raiseSpeed(70);
        boolean isOverspeed = myCar.isOverspeed();
        if(isOverspeed){
            System.out.println("骑车超速行驶中");
        }else{
            System.out.println("汽车没有超速");
        }
        myCar.raiseSpeed(70);
        isOverspeed = myCar.isOverspeed();
        if (isOverspeed){
            System.out.println("汽车超速行驶中");
        }else {
            System.out.println("汽车没有超速");
        }
    }
}

```



#### final

1. 被final修饰的变量不可以改变，又被称为常量
2. 被final修饰的方法不可以被重写
3. 被final修饰的类不可以被继承



#### 抽象

在java中只声明，不实现

抽象方法：使用abstract来修饰，不可有方法体，直接用分号来结束即可

抽象类：如果有一个类中有抽象方法，这个类必须是一个抽象类

特点：

1. 抽象类不可以创建对象
2. 抽象类的子类，必须重写父类中的抽象方法，否则，子类必须也是抽象类

通过抽象类可以强制要求子类中必须有哪些方法

小知识点：抽象类中可以有正常的方法

#### 接口

接口实际上是一种特殊的抽象类

接口中所有的方法都是抽象方法

接口使用interface来声明





