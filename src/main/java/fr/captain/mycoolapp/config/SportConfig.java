package fr.captain.mycoolapp.config;

import fr.captain.mycoolapp.common.Coach;
import fr.captain.mycoolapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
