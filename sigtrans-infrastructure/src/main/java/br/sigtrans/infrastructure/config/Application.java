package br.sigtrans.infrastructure.config;

import br.sigtrans.sigtrans.configuration.web.WebConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan(basePackages = {
        "br.sigtrans.sigtrans",
        "io.gumga"
})
@EnableWebMvc
@Import(WebConfiguration.class)
public class Application {

}
