# Mybatis
## 添加Mybatis支持
pom.xml
```xml
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>1.3.0</version>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```
## 添加实体类
User.java
## 持久层
UserMapper.java
## 测试类
UserMapperTest.java
