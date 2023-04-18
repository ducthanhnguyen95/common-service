package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import services.CommentService;

@Configuration
@ComponentScan(basePackages = {"services"})
public class ProjectConfiguration {

//    @Bean
//    public CommentService commentService () {
//        return new CommentService();
//    }

}
