package ru.sectorsj.springcourse.testbeanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class TestBeanFactoryPostProc implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory
   BeanFactory) throws BeansException {
        //Получение имен BeanDefinition всех бинов, объявленных пользователем
        String[] beanDefinitionNames = BeanFactory.getBeanDefinitionNames();

        // Перебор массива для получения доступа к каждому имени
        for (String name: beanDefinitionNames) {

            //Получение BeanDefinition по имени
            BeanDefinition beanDefinition = BeanFactory.getBeanDefinition(name);

            // Вывод информации о BeanDefinition
            System.out.println(beanDefinition.toString());
        }
    }
}
