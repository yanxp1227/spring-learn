package soundsystem;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //配置类注解
@ComponentScan(excludeFilters = {
})  //组件扫描，默认扫描当前类的同级包下以及其子包下的类
public class CDPlayerConfig { 
}
