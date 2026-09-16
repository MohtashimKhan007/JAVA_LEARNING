package org.springframework.boot.webmvc.test.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.assertj.MockMvcTester;

/**
 * Bean definitions for {@link MockMvcTesterConfiguration}.
 */
@Generated
public class MockMvcTesterConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'mockMvcTesterConfiguration'.
   */
  public static BeanDefinition getMockMvcTesterConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MockMvcTesterConfiguration.class);
    beanDefinition.setInstanceSupplier(MockMvcTesterConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'mockMvcTester'.
   */
  private static BeanInstanceSupplier<MockMvcTester> getMockMvcTesterInstanceSupplier() {
    return BeanInstanceSupplier.<MockMvcTester>forFactoryMethod(MockMvcTesterConfiguration.class, "mockMvcTester", MockMvc.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.webmvc.test.autoconfigure.MockMvcTesterConfiguration", MockMvcTesterConfiguration.class).mockMvcTester(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'mockMvcTester'.
   */
  public static BeanDefinition getMockMvcTesterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MockMvcTester.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.webmvc.test.autoconfigure.MockMvcTesterConfiguration");
    beanDefinition.setInstanceSupplier(getMockMvcTesterInstanceSupplier());
    return beanDefinition;
  }
}
