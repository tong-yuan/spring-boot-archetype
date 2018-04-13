
本项目目标是做成maven骨架，具体eclipse和idea如何添加maven骨架请自行百度

项目组件相关说明：

数据库：mysql
    数据源：druid
    orm框架：mybatis-plus @see http://baomidou.oschina.io/mybatis-plus-doc/#/generic-crud
    
redis：采用lettuce替代jedis，实际使用方式依旧使用RedisTemplate
    使用到的地方：cache、session
 
线程池：TaskExecutorConfig为配置类，setThreadNamePrefix:定义线程池名称，使用方式@Async("TaskExecutor"),可定义多个线程池，使用时指明使用那个
 
web项目开启的配置：请移步WebConfig
    
日志：采用默认logback，基本输出和环境切换已配置好，可调整
 
lombok：是一种 Java™ 实用工具,可用来帮助开发人员消除 Java 的冗长，@see https://blog.csdn.net/54powerman/article/details/72624987
 

 
    
    


