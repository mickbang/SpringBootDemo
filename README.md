# SpringBootDemo
Springboot+mybatis+pageHelper+genterator

## 注意
1.generator的版本可以在pom.xml中配置如:</br>
```
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>

            <plugin>
                <groupId>org.mybatis.generator</groupId>
                <artifactId>mybatis-generator-maven-plugin</artifactId>
                <version>1.3.5</version>
                <configuration>
                    <!--允许移动生成的文件-->
                    <verbose>true</verbose>
                    <!--允许覆盖生成的文件-->
                    <overwrite>true</overwrite>
                </configuration>

                <dependencies>
                    <!-- 在pom中可以直接配置依赖的数据库 generatorConfig.xml就不需要再配置数据库的jar了 -->
                    <dependency>
                        <groupId>mysql</groupId>
                        <artifactId>mysql-connector-java</artifactId>
                        <version>5.1.47</version>
                    </dependency>
                </dependencies>
            </plugin>
        </plugins>
    </build>
```

2.genertorConfig.xml:</br>
```
        <?xml version="1.0" encoding="UTF-8"?>
        <!DOCTYPE generatorConfiguration
            PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
            "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">
        <generatorConfiguration>
            <!-- 数据库驱动:选择你的本地硬盘上面的数据库驱动包-->
            <!--<classPathEntry  location="D:\mysql-connector-java-5.1.47.jar"/>-->
            <context id="DB2Tables"  targetRuntime="MyBatis3">
                <commentGenerator>
                    <property name="suppressDate" value="true"/>
                    <!-- 是否去除自动生成的注释 true：是 ： false:否 -->
                    <property name="suppressAllComments" value="true"/>
                </commentGenerator>
                <!--数据库链接URL，用户名、密码 -->
                <jdbcConnection
                    driverClass="com.mysql.jdbc.Driver"
                    connectionURL="jdbc:mysql://localhost:3306/weadmin?characterEncoding=utf-8"
                    userId="root"
                    password="000000">
                </jdbcConnection>
                <javaTypeResolver>
                    <property name="forceBigDecimals" value="false"/>
                </javaTypeResolver>
                <!-- 生成模型的包名和位置-->
                <javaModelGenerator targetPackage="com.lq.weadmin.model" targetProject="src/main/java">
                    <property name="enableSubPackages" value="true"/>
                    <property name="trimStrings" value="true"/>
                </javaModelGenerator>
                <!-- 生成映射文件的包名和位置-->
                <sqlMapGenerator targetPackage="mapper" targetProject="src/main/resources">
                    <property name="enableSubPackages" value="true"/>
                </sqlMapGenerator>
                <!-- 生成DAO的包名和位置-->
                <javaClientGenerator type="XMLMAPPER" targetPackage="com.lq.weadmin.dao" targetProject="src/main/java">
                    <property name="enableSubPackages" value="true"/>
                </javaClientGenerator>
                <!-- 要生成的表 tableName是数据库中的表名或视图名 domainObjectName是实体类名-->
                <table tableName="t_test" domainObjectName="TTest" enableCountByExample="false" enableUpdateByExample="false"                               enableDeleteByExample="false" enableSelectByExample="false" selectByExampleQueryId="false"></table>
            </context>
        </generatorConfiguration>
```
