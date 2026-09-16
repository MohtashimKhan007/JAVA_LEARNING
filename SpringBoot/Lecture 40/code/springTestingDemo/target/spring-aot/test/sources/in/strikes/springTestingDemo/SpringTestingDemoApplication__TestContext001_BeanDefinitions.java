package in.strikes.springTestingDemo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SpringTestingDemoApplication}.
 */
@Generated
public class SpringTestingDemoApplication__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'springTestingDemoApplication'.
   */
  public static BeanDefinition getSpringTestingDemoApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringTestingDemoApplication.class);
    beanDefinition.setInstanceSupplier(SpringTestingDemoApplication::new);
    return beanDefinition;
  }
}
