# cocktest
spring boot 项目，测试cockroachdb.

主要配置
```
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:postgresql://localhost:26258,localhost:26259,localhost:26257/customers?sslmode=disable

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQL94Dialect
spring.jpa.show-sql=true
spring.datasource.username=myuser
spring.datasource.password=""
server.port=9999
```

项目主要使用

1. jpa 
2. postgresql driver
3. spring-boot-starter-web
4. commons-lang3 生成随机字符串
