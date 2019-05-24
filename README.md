# 轻量级前后端分离SpringBoot Rest后端脚手架
## 特性：
+ 使用jwt验证机制 无状态获取用户信息
+ 采用Mybatis-plus数据持久层快速实现CRUD
+ 使用swgger2作为Api接口文档
+ 使用hutools作为工具类
+ 使用代码生成器快速生成mapper文件和model文件
## 测试部署
创建kfcoding_research数据库。执行sql里的research_users.sql文件  
调用
```http://localohst:9000/auth```
POST请求
```
{
	account:"admin",
	password:"123456"
}  
```
获取token  
再调用
```
http://locahost:9000/users
```
GET请求
header中添加Authorization: 获取的token值
获得当前用户信息
