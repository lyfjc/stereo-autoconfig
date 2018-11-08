package soundsystem;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"soundsystem"})
//可以指定多个基础包

//@ComponentScan(basePackageClasses = {CDPlayer.class})
//类所在的包作为组件扫描基础包，可以设置一个空接口
public class CDPlayerConfig { 
}
