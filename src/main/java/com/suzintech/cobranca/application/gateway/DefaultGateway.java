package com.suzintech.cobranca.application.gateway;

import java.util.List;

public interface DefaultGateway<DTO> {

    List<DTO> buscarRegistros();
}
