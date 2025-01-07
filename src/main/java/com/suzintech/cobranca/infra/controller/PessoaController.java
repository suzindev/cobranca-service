package com.suzintech.cobranca.infra.controller;

import com.suzintech.cobranca.application.usecase.AdicionarBancoInteractor;
import com.suzintech.cobranca.infra.controller.request.BancoRequest;
import com.suzintech.cobranca.infra.controller.response.BancoResponse;
import com.suzintech.cobranca.infra.mapper.BancoMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
@RequiredArgsConstructor
public class PessoaController {

    private final AdicionarBancoInteractor adicionarBancoInteractor;

    private final BancoMapper bancoMapper;

    @PostMapping
    @Transactional
    ResponseEntity<BancoResponse> create(@Valid @RequestBody BancoRequest request) {
        var obj = adicionarBancoInteractor.execute(bancoMapper.toDTO(request));

        return new ResponseEntity<>(new BancoResponse(obj), HttpStatus.CREATED);
    }
}
