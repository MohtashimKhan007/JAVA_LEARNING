package org.springframework.boot.webmvc.test.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.webmvc.autoconfigure.DispatcherServletPath;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Bean definitions for {@link MockMvcAutoConfiguration}.
 */
@Generated
public class MockMvcAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'mockMvcAutoConfiguration'.
   */
  public static BeanDefinition getMockMvcAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MockMvcAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(MockMvcAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dispatcherServletPath'.
   */
  private static BeanInstanceSupplier<DispatcherServletPath> getDispatcherServletPathInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DispatcherServletPath>forFactoryMethod(MockMvcAutoConfiguration.class, "dispatcherServletPath", WebMvcProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.webmvc.test.autoconfigure.MockMvcAutoConfiguration", MockMvcAutoConfiguration.class).dispatcherServletPath(args.get(0)));
  }

  /**
   * Get the bean definition for 'dispatcherServletPath'.
   */
  public static BeanDefinition getDispatcherServletPathBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DispatcherServletPath.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.webmvc.test.autoconfigure.MockMvcAutoConfiguration");
    beanDefinition.setInstanceSupplier(getDispatcherServletPathInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dispatcherServlet'.
   */
  private static BeanInstanceSupplier<DispatcherServlet> getDispatcherServletInstanceSupplier() {
    return BeanInstanceSupplier.<DispatcherServlet>forFactoryMethod(MockMvcAutoConfiguration.class, "dispatcherServlet", MockMvc.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.webmvc.test.autoconfigure.MockMvcAutoConfiguration", MockMvcAutoConfiguration.class).dispatcherServlet(args.get(0)));
  }

  /**
   * Get the bean definition for 'dispatcherServlet'.
   */
  public static BeanDefinition getDispatcherServletBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DispatcherServlet.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.webmvc.test.autoconfigure.MockMvcAutoConfiguration");
    beanDefinition.setInstanceSupplier(getDispatcherServletInstanceSupplier());
    return beanDefinition;
  }
}
