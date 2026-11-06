package consumo.api.RestRickAndMorty.Config;

import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.servlet.mvc.method.annotation.JsonViewResponseBodyAdvice;

public class RMConfig {

    @Bean
    public  RestClient restclient(@Value{"$api.cliente.api.characters"} String base){
        return  restclient.get()
                .base(base)
                .Builder(JsonViewResponseBodyAdvice);
    }

}
