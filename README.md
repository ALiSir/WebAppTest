# WebAppTest
maven spring mybatis 简单web应用

# 安装
1.拷贝项目到本地,并导入开发工具中（j2e eclipse）,并安装到本地仓库，`mvn` `clean` `install`

2.修改mybatis.xml(数据库配置文件)中的`url`、`username`、`password`；

`<property name="url" value="jdbc:mysql://数据库地址/数据库名?characterEncoding=UTF-8" />`
        
`<property name="username" value="用户名" />`
        
`<property name="password" value="密码" />`

3.部署到Tomcat中并运行

# 运行
1.输入网址 `服务器IP/WebAppTest/api/login.do`

2.运行结果：`Connect DB faild!  I'am WebAppTest!`
        
3.修改`login.xml`中数据库查询语句`select * from tp_user where id = 0;`改为对应能在你机器中正常运行的sql语句；

4.成功结果：`Connect DB Succeed!  I'am WebAppTest!`

# 联系方式：

QQ群：584616826
  
![QQ群](https://github.com/ALiSir/Resource/raw/master/Images/qq.JPG "扫一扫，加入QQ群！")



