# 作者及联系方式
作者：冰河  
QQ：2711098650  
微信公众号： 冰河技术

# 项目简述
mykit架构中独立出来的mykit-wechat-sdk微信开发SDK，提供通用的微信开发解决方案供其他应用或服务以及第三方应用或服务使用

# 项目结构描述
本SDK封装了第三方系统与微信公众平台交互的各种逻辑，对请求数据和响应数据也进行了相关的封装操作,极大的简化了第三方的微信开发工作量

## mykit-wechat-beans
封装了XML/JSON对应的Java类，调用者只需要关注此模块中的JavaBean即可，无需过多关注微信返回的原始XML/JSON字符串，极大简化了微信开发的复杂量

## mykit-wechat-cache
SDK的缓存模块，目前SDK支持的缓存为Redis, 有关Redis的配置文件，SDK指定的配置文件名称为：redis.properties，若使用者未配置任何关于Redis缓存的配置，则Redis默认缓存配置如下：   
```
redis.cluster.node.one=10.2.2.231
redis.cluster.node.one.port=7001

redis.cluster.node.two=10.2.2.231
redis.cluster.node.two.port=7002

redis.cluster.node.three=10.2.2.231
redis.cluster.node.three.port=7003

redis.cluster.node.four=10.2.2.231
redis.cluster.node.four.port=7004

redis.cluster.node.five=10.2.2.231
redis.cluster.node.five.port=7005

redis.cluster.node.six=10.2.2.231
redis.cluster.node.six.port=7006

redis.cluster.node.seven=10.2.2.231
redis.cluster.node.seven.port=7006
```   

使用者也可以自行配置Redis缓存的相关参数，但必须将配置文件命名为redis.properties，放到自己工程的classpath路径下，同时，配置文件中的Key必须与默认文件提供的Key值相同。

## mykit-wechat-config
整个SDK的核心配置模块，主要配置了SDK的各种系统级参数，包括请求微信服务器的接口API和其他一些配置项。

## mykit-wechat-http
整个SDK直接与微信服务器进行交互的模块，封装了各种方法与微信服务器进行交互。

## mykit-wechat-utils
整个SDK的基础工具模块，封装了各种基础工具类供其他模块调用

## mykit-wechat-core
整个SDK的核心入口，提供对外界访问的基础能力

## mykit-wechat-test
SDK的测试模块，提供整个SDK功能的基础测试方法

# 使用方法
在Maven的pom.xml中加入如下配置即可：  

        <dependency>  
           <groupId>io.mykit.wechat.sdk</groupId>  
            <artifactId>mykit-wechat-core</artifactId>  
            <version>1.0.0-SNAPSHOT</version>  
        </dependency>


# 备注
本SDK还在开发中，目前未添加到Maven中央仓库，后续开发完成会添加到Maven中央仓库

# 扫一扫关注微信公众号

**你在刷抖音，玩游戏的时候，别人都在这里学习，成长，提升，人与人最大的差距其实就是思维。你可能不信，优秀的人，总是在一起。** 
  
扫一扫关注冰河技术微信公众号  
![微信公众号](https://github.com/sunshinelyz/binghe_resources/blob/master/images/subscribe/qrcode_for_gh_0d4482676600_344.jpg)  
