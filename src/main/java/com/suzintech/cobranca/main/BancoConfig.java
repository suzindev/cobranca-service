package com.suzintech.cobranca.main;

import com.suzintech.cobranca.application.gateway.AdicionarBancoGateway;
import com.suzintech.cobranca.application.usecase.AdicionarBancoInteractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BancoConfig {

    @Bean
    AdicionarBancoInteractor adicionarBancoInteractor(AdicionarBancoGateway gateway) {
        return new AdicionarBancoInteractor(gateway);
    }
}
