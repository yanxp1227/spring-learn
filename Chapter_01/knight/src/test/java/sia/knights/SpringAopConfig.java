package sia.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yuanxipei
 * @date 2020/6/23 10:03
 */
@Configuration
//@EnableAspectJAutoProxy
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringAopConfig {

    @Bean
    public AudienceAspect audienceAspect(){
        return new AudienceAspect();
    }
}
