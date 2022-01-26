# 我的Java学习笔记

by元子 2021年10月1日

![](http://yuanzigsa.com/wp-content/uploads/2022/01/zard.jpg)

[TOC]



# Chapter1：初识Java

### 基本认识

- 类（Class）：java世界中的一类事物
- 对象（Object）：事物具体存在的个体
- 方法（Method）：物体的功能
- main（）方法：所有java程序执行的起点

### JDK、JRE、JVM

#### 区别

- JVM
- java 虚拟机，用于保证java的跨平台特性，不过 jvm 不是跨平台的。
- JRE
  - java 的运行环境 ,包括 jvm+java 的核心类库。
- JDK
  - java 的开发工具 ,包括 jre+开发工具
- 其它
  - bin
    - 最主要的是编译器(javac.exe)
  - include
    - java和JVM交互用的头文件
  - lib
    - 类库

#### 联系

- JDk包含JRE，JDK 和 JRE 中都包含 JVM
- “ Write Once ， Run Anywhere （一次编写，到处运行）”，正是建立在 JRE 的基础-之上。

### 环境变量 path 和 classpath 的作用

- path 是配置 Windows 可执行文件的搜索路径，即扩展名为 .exe 的程序文件所在的目

录，用于指定 DOS 窗口命令的路径。

- Classpath 是配置 class 文件所在的目录， 用于指定类搜索路径， JVM 就是通过它来寻

找该类的 class 类文件的。

### 变量

- 变量的作用
- 用来存储数据。
- 为什么要定义变量
  - 用来不断的存放同一类型的常量，并可以重复使用

### & 和&& 的区别

- && 会出现短路，如果可以通过第一个表达式判断出整个表达式的结果，则不

继续后面表达式的运算；只能操作 boolean 类型数据；

- &不会出现短路， 将整个表达式都运算。 既可以操作 boolean 数据还可以操作

数。

### 标示符命名规则

- 由数字 (0-9)，大小写英文字母，以及 _和$组成。
- 不能以数字开头。
- 不能使用关键字来自定义命名。



### 数据类型

- 基本数据类型 (4 类 8 种)
  - 整数类型： byte、short、int、long
  - 浮点数类型： float 、double
  - 字符类型： char
  - 布尔类型： boolean(ture false)

- 引用数据类型
  - 类
  - 接口
  - 数组

### 类型转换

- 精度从高到低
  -  double > float	>  long  > int >  short(char)  >  byte**

- 自动类型转换 将一个低精度 ---

- 强制类型转换 将一个高精度 --- (精度会下降 )

### java 语言的三种技术架构

- J2EE：企业版
  - 涉及 Servlet、Jsp 等相关技术，主要针对对于 Web 应用程序开发。

- J2SE：标准版
  - 该技术体系是其他两者的基础。

- J2ME：小型版
  - 针对嵌入式小型电子产品，如手机中的应用程序等。

### switch循环语句

```java
switch (表达式) {
	case 1:
		语句体1;
		break;
	case 2:
		语句体2;
		break;
...
	default:
		语句体n+1;
		break;
}

```





### 函数

- 定义

  - 函数就是定义在类中的具有特定功能的一段独立小程序。

- 特点
  - 定义函数可以将功能代码进行封装
  - 便于对该功能进行复用
  - 函数只有被调用才会被执行
  - 函数的出现提高了代码的复用性
  - 对于函数没有具体返回值的情况，返回值类型用关键字 void 表示，那么该函数中的 return 语句如果在最后一行可以省略不写
  - 
- 函数的应用两个明确
  - 明确要定义的功能最后的结果是什么
  - 明确在定义该功能的过程中，是否需要未知内容参与运算


### 方法

- 定义
  - 对功能或者动作的封装

```java
public static void 方法名(){
	方法体
}
方法名()
```

- public static void 照着写

- 方法体
  - 这件事儿到底该怎么做

- 不可以在方法里定义方法

### 重载

- 概念
  - 在同一个类中， 允许存在一个以上的同名函数， 只要它们的参数个数或者参数类型不同即可。

- 特点
  - 与返回值类型无关，只看参数列表 (参数类型以及参数个数 )。

- 好处
  - 方便于阅读，优化了程序设计。

### 数组

- 概念
  - 同一种数据类型的集合。

- 好处
  - 可以自动给数组中的元素从 0 开始编号，方便操作这些元素。

### 内存结构

- 栈内存
  - 用于存储局部变量，当数据使用完，所占空间会自动释放。

- 堆内存
  - 数组和对象，通过 new 建立的实例都存放在堆内存中。
- 方法区
  - 静态成员、构造函数、常量池、线程池

- 本地方法区
  - windows系统占用

- 寄存器
  - 存储指向下一条要执行指令的地址



# Chapter2：面向对象

### final

- 被final修饰的变量不可以改变，又被称为常量
- 被final修饰的方法不可以被重写
- 被final修饰的类不可以被继承

### 抽象

- 在java中只声明，不实现
- 抽象方法
- 使用abstract来修饰，不可有方法体，直接用分号来结束即可
- 抽象类
- 如果有一个类中有抽象方法，这个类必须是一个抽象类
- 特点
  - 抽象类不可以创建对象
  - 抽象类的子类，必须重写父类中的抽象方法，否则，子类必须也是抽象类
- 通过抽象类可以强制要求子类中必须有哪些方法
- 小知识点
  - 抽象类中可以有正常的方法

### 接口

- 接口实际上是一种特殊的抽象类
- 接口中所有的方法都是抽象方法
- 接口使用interface来声明
- 类只是简单继承
- 接口也具有多态性 
- 接口可以把很多不相关的内容进行整合
- 特点
   - 接口中所有的方法都是抽象分方法，都是公开的
   - 接口中所有的变量都是全局静态常量

### 成员变量的初始值

- java中的所有变量必须先声明，后赋值才能使用

- java中的成员变量，在创建对象的时候，都会执行一次初始化操作，都会给一个默认值

- 基本数据类型默认值都是0 包括bloolean false=0

- 引用数据类型：null（null表示空，什么都没有，占位）

### object

- 万事万物皆为对象

- 所有的东西都是对象

- 在java中所有的类都要继承object

- object是一个类，所有类的根

### toString方法

- toString()对一个对象的字符串的表示形式

- JAVA官方推荐重写这个方法，默认的那个太丑了

### instanceof

- 判断xxx对象是否是xxx类型

### 内存分析

- 堆
  - 主要存放对象
- 栈
  - 局部变量，以及基本数据类型的变量
- 代码区
  - 类和方法
- 数据区
  - 常量池和静态变量

### 参数传递的问题

- 值传递
  - 把变量的值作为参数进行传递

- 引用传递
  - 直接把变量作为参数进行传递
- Java使用的是值传递

### 异常的简介

- 异常就是错误对象

- 分类
  - 编译型异常	
  - 运行时异常

- 抛异常

- 捕获异常

### 异常的分类

- RuntimeException
  - 运行时异常，一般不手动处理，出问题了再处理
- 其他Exception
  - 必须要经过手动处理
- Error
  - 一般指的系统级错误

### 异常的处理-try...catch

```java
try{
	尝试执行的代码
}catch(Exception e){
	处理异常的代码
}finally{
	最终的
}
```

### 异常的处理-throws和throw

- Throws
  - 表示方法准备要抛出来一个异常

- Throw
  - 表示向外抛出一个异常
- 产生的错误尽可能的自己处理，少向外抛出异常

### 自定义异常

直接继承Exception或者RuntimeException来实现自定义异常



# Chapter3：核心编程

## 常用api
### 概述



### Math数学类

- abs（）：绝对值

- max（）：最大值

- min（）：最小值

- pow（）：求次幂

- round（）：四舍五入

- sqrt（）：求平方根

  

  JAVA官方api文档：https://docs.oracle.com/javase/8/docs/api/

- 求一元二次方程

```java
import java.sql.SQLOutput;
import java.util.Scanner;

public class TestMath {
    public static void main(String[] args) {
        
        System.out.println("计算一元二次方程的解");
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入a：");
        double a = sc.nextInt();

        System.out.println("请输入b：");
        double b =sc.nextInt();

        System.out.println("请输入c：");
        double c = sc.nextInt();

        double dt = Math.pow(b,2) - 4*a*c;
        if (dt <0 ){
            System.out.println("无解");
        }else if(dt == 0){
            System.out.println("此方程有一个解");
            double x = (-b) / (2*a);
            System.out.println("解x="+x);
        }else{
            System.out.println("此方程有两个解");
            double x1 = (-b+Math.sqrt(dt))/(2*a);
            double x2 = (-b-Math.sqrt(dt))/(2*a);

        }

    }
}

```

### 基本数据类型包装类

- byte -> Byte

- short ->Short

- int -> Integer

- long -> Long

- float ->Float

### Java中的时间

- Date 日期
  - new Date（）可以获取到系统时间
  - getTIME（）能获取到时间的long的表示形式，可以用来计算时间差

- Clender 日历
  - get（）获取到时间的某一个部分
  - set（）设置时间->计算器



### String详解

- “字符串”
- 字符串是一个不可变的数据类型，会返回新字符串而不是在原有基础上修改

### StringBuffer和StringBuiler

-  String是一个不可变的数据类型
- StringBuffer和StringBuilder，可变字符串

## 容器

### 容器的概述

- 定义
  - 能装对象的对象
- List线性结构，可变长度
- Set集合，非线性，去除重复
- Map映射，存储的时候，以可以：value的形式存储数据，名字：电话
- 在java中的所有集合的根：collection接口

### List

- ArrayList
  - 列表
  - 应用最多，查询方便
  - 列表可以放置重复的数组，按照我们存储的顺序进行存储
- LinkedList
  - 链表

- 常用操作
  - add（）添加元素
  - remove（）删除元素
  - size（）列表的大小（列表中装了多少个元素）
  - get（i）从列表中获取某个元素
  - contains（）判断容器中是否有xxx东西

- 遍历列表

### Set集合

- HashSet
  - 无序 乱的 无重复
- TreeSet
  - 默认排序 不重复

-  set的操作
  - add（）添加元素
  - remove（）删除元素
  - size（）set中的元素的个数

### Map容器

-  HashMap
  - 不排序
- TreeMap
  - 排序
- map的操作
  - put（key,value）存储数据
  - remove（key）删除数据
  - size（）map存储了多少个键值对
  - containsKey（）判断map是否包含了某个key
  - 如果出现了相同的key，原来的数据会被替代
  - keySet（）把map中的所有的key打包成set集合返回
  - get（key）通过key查询value

### 迭代器Iterator

- set
- 迭代
  - 一个一个的往出拿
- 下一个
- next（）
  - 下一个
- hasNext（）
  - 判断是否存在下一个元素

### 泛型

- 规范器内的数据类型

- 容器<数据类型>
- 碗筷<盐>
- Set和List泛型规范是一样的
- Map有一点不一样

### 增强For

- 语法

  ```java
  for(类型 变量:数组或集合){
  	循环体
  }
  ```

- 用途

  - 循环遍历数组

## IO流 

### 概述

- File文件操作
- IO流
  - IO：input&output
  - System.in

### File类

- 定义
  - 表示操作系统中的文件或者文件夹
- 文件路径
  - 绝对路径
    - 从磁盘根目录
  - 相对路径
    - 相对于当前项目
    - 文件夹/文件

### IO流-节点流

- 流的分类

  - 按照读写的方向来讲，分为输入流和输出流（站在程序的角度去分析）
  - 按照读写内容的单位俩将，分为字节流和字符流
  - 按照流的功能不同，分为节点流和处理流

- 流的家族体系

  |        | 输入        | 输出         |
  | ------ | ----------- | ------------ |
  | 字节流 | InputStream | OutputStream |
  | 字符流 | Reader      | Writer       |

- 4个祖宗

  - InputStream
  - OutputStream
  - Reader
  - Writer

- 抽象类

- 文件流

  - `FileInputStream 文件字节输入流
  - FilOutputStream 
  - FileReader
  - FileWriter

###　缓冲流

- IO流
  - 输入流，输出流
  - 字节流，字符流
  - 节点流，处理流
- 处理流
  - 缓冲流
  - 转换流
  - 对象流
- 缓冲流
  - 定义
    - 带有缓冲区的数据流
  - 分类
    -  BufferedInputStream
    - BufferedOutputStream
    - BufferedReader 读取文本文件最好的方式
    - BufferedWriter

### 转换流

- 字节流>字符流
  - inputStreamReader
  - OutputStreamWriter
- Scanner sc = new Scanner（System.in）

### 对象流

- ObjectinputStream

- ObjectoutputStream

  ```java
  Exception in thread "main" java.io.NotSerializableException: IO.Person
  	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
  	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
  	at IO.ObjectLiu.main(ObjectLiu.java:11)
  ```

- 序列化

  - 把一个对象转化成字节的过程

- 反序列化

  - 把字节转化成对象

- 在java中只需要给类添加一个实现，Seriallizable，你就是可以被序列化的一个类了

### 文件修改操作

- 逐行读取文件中的内容，根据内容进行替换，把替换的结果记录在一个新闻建立，直到数据写入完毕，把源文件删除，把新文件的名字改成源文件的名字



## 多线程

### 概述

- 充分利用计算机资源，同时执行不同的操作
- 计算机操作系统
  - 进程和线程
- 使用java来完成多线程编码
- 线程中的常用方法
- 线程同步（重点）
- 死锁
- 生产者消费者模型.异步

### 操作系统简介

- 操作系统存在的意义
  - 帮助上层应用程序屏蔽到硬件丑陋的接口

- 进程和线程
  - 进程
    - 正在执行的程序，其实就是一块内存区域，内部存储着程序的资源
  - 线程
    - 程序被CPU调度的最小单位

### java多线程

- 继承Thread类，重写run方法
- 实现Runable接口，实现run方法

- 必须
  - run（）
    - 线程执行的时候要执行的代码
  - start（）
    - 启动一个线程

### 线程中的相关方法

- setPriority（）
  - 设置优先级
  - 1-10.5
- sleep（）
  - 睡眠
- join（）
  - 让主线程等待这个子线程执行完毕
- yield（）
  - 高风亮节，让出CPU，让别人执行一下

- interrupt（）
  - 打断正在睡眠中的线程

### 线程同步

- 定义
  - 当多个线程共享同一个资源的时候，我们可以在某一个线程访问到这个资源的时候，把这个资源暂时封锁，等待执行结束，释放这个锁，其他线程才可以进行执行，线程同步

- 等待其它线程释放锁，让线程更加安全
- 在方法生命上添加一个synchronized关键字 
- 在方法内部使用synchronized（）{}语句块对特定的对象上锁
- 手动上锁->用得最少

### 线程的生命周期

- Thread t = new Thread();

- t.start(); 开启一个线程，线程处于就绪状态

### 生产者消费者模型

- 读取视频，对视频内容进行鉴定 ->发现黄色内容，把该视频进行标记->发送给公安局
- 异步
  - 平衡两端效率不同的问题
- Queue队列
  - BlockingQueue 
    - 阻塞队列
    - 当队列中没有数据的时候，需要拿数据，队列会将程序阻塞，阻塞到有数据，队列继续工作
- Atoicinteger
  - 线程安全的数字

## 网络编程

### TCP编程

- CS架构

  - 服务器客-户端程序
  - 优点
    - 把一部分计算留在客户端进行，缓解服务器压力
  - 缺点
    - 如果游戏或者软件升级，客户端必须进行手动更新
  - 客户端
    - 可以给服务器发送数据的软件，可以接受服务器发过来的信息
  - 服务器
    - 负责接受客户端发来的数据，处理数据，给客户端响应

- BS架构
    - 浏览器-服务器
    - 优势
      - 维护成本低
- 缺点
      - 没办法在客户端做大量的计算
    
- Socket

  - 衔接应用程序和底层架构
