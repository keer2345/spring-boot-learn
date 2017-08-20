# JPA
>http://blog.csdn.net/je_ge/article/details/53294949
## 添加JPA和数据库支持
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```
## 创建实体
User.java
## 创建持久层
UserRepository.java
## 测试
JpaApplicationTests.java