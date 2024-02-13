package escoliapiamataro.com.CAIXABANKMS.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.net.InetSocketAddress;
import java.net.Proxy;

@Configuration
@ComponentScan(basePackages = "escoliapiamataro.com.CAIXABANKMS")
public class DemoConfiguration {

}
