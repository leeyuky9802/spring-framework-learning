package site.yangxiao.coding;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class PersonPostProcessor implements BeanPostProcessor {
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("Bean '" + beanName + "' created : " + bean.toString());
        return bean;
    }
}
