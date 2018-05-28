package mixedConfig3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:/mixedConfig3/cd-config.xml")
public class SoundSystemConfig {

}
