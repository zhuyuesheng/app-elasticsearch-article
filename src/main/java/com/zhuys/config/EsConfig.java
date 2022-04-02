package com.zhuys.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author zhuys
 * @company tydic
 * @create 2022-04-01
 * InitializingBean : 初始化bean
 * DisposableBean   : 销毁bean
 * FactoryBean      : bean工厂
 */
@Configuration
public class EsConfig implements InitializingBean, DisposableBean, FactoryBean<RestHighLevelClient> {

    /**
     * <li>hosts :配置的值 </li>
     */
    @Value("${elasticsearch.host}")
    private String host;

    /**
     * <li>restHighLevelClient :restHighLevel客户端 </li>
     */
    private RestHighLevelClient restHighLevelClient;

    /**
     * 返回实例
     * @return RestHighLevelClient
     * @throws Exception 异常信息
     */
    @Override
    public RestHighLevelClient getObject() throws Exception {
        return this.restHighLevelClient;
    }

    /**
     * 反射
     *
     * @return RestHighLevelClient.class
     */
    @Override
    public Class<?> getObjectType() {
        return RestHighLevelClient.class;
    }

    /**
     * 客户端是否单例
     * @return true
     */
    @Override
    public boolean isSingleton() {
        return true;
    }

    /**
     * 客户端实例的销毁
     * @throws Exception 异常信息
     */
    @Override
    public void destroy() throws Exception {
        if (restHighLevelClient != null) {
            restHighLevelClient.close();
        }
    }

    /**
     * 注入参数
     * @throws Exception 异常信息
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        restHighLevelClient = buildClient();
    }

    /**
     * <li>Description: 自定义的构造方法 </li>
     *
     * @return RestHighLevelClient
     */
    public RestHighLevelClient buildClient() {
        try {
            //这里的builder方法有两个方式,第一个是传入Node(包含了多个节点,需要密码这些,我们没有配置,就暂时不需要),第二个就是传入HttpHost
            restHighLevelClient = new RestHighLevelClient(RestClient.builder(HttpHost.create(host)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return restHighLevelClient;
    }

}
