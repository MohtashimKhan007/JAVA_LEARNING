package org.springframework.boot.webmvc.test.autoconfigure;

import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.web.context.WebApplicationContext;

/**
 * Bean definitions for {@link MockMvcConfiguration}.
 */
@Generated
public class MockMvcConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.webmvc.test.autoconfigure.MockMvcConfiguration'.
   */
  private static BeanInstanceSupplier<MockMvcConfiguration> getMockMvcConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MockMvcConfiguration>forConstructor(WebApplicationContext.class, WebMvcProperties.class)
            .withGenerator((registeredBean, args) -> new MockMvcConfiguration(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'mockMvcConfiguration'.
   */
  public static BeanDefinition getMockMvcConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MockMvcConfiguration.class);
    beanDefinition.setInstanceSupplier(getMockMvcConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'mockMvcBuilder'.
   */
  private static BeanInstanceSupplier<DefaultMockMvcBuilder> getMockMvcBuilderInstanceSupplier() {
    return BeanInstanceSupplier.<DefaultMockMvcBuilder>forFactoryMethod(MockMvcConfiguration.class, "mockMvcBuilder", List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.webmvc.test.autoconfigure.MockMvcConfiguration", MockMvcConfiguration.class).mockMvcBuilder(args.get(0)));
  }

  /**
   * Get the bean definition for 'mockMvcBuilder'.
   */
  public static BeanDefinition getMockMvcBuilderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultMockMvcBuilder.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.webmvc.test.autoconfigure.MockMvcConfiguration");
    beanDefinition.setInstanceSupplier(getMockMvcBuilderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'springBootMockMvcBuilderCustomizer'.
   */
  private static BeanInstanceSupplier<SpringBootMockMvcBuilderCustomizer> getSpringBootMockMvcBuilderCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SpringBootMockMvcBuilderCustomizer>forFactoryMethod(MockMvcConfiguration.class, "springBootMockMvcBuilderCustomizer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.webmvc.test.autoconfigure.MockMvcConfiguration", MockMvcConfiguration.class).springBootMockMvcBuilderCustomizer());
  }

  /**
   * Get the bean definition for 'springBootMockMvcBuilderCustomizer'.
   */
  public static BeanDefinition getSpringBootMockMvcBuilderCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringBootMockMvcBuilderCustomizer.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.webmvc.test.autoconfigure.MockMvcConfiguration");
    beanDefinition.setInstanceSupplier(getSpringBootMockMvcBuilderCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'mockMvc'.
   */
  private static BeanInstanceSupplier<MockMvc> getMockMvcInstanceSupplier() {
    return BeanInstanceSupplier.<MockMvc>forFactoryMethod(MockMvcConfiguration.class, "mockMvc", MockMvcBuilder.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.webmvc.test.autoconfigure.MockMvcConfiguration", MockMvcConfiguration.class).mockMvc(args.get(0)));
  }

  /**
   * Get the bean definition for 'mockMvc'.
   */
  public static BeanDefinition getMockMvcBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MockMvc.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.webmvc.test.autoconfigure.MockMvcConfiguration");
    beanDefinition.setInstanceSupplier(getMockMvcInstanceSupplier());
    return beanDefinition;
  }
}
