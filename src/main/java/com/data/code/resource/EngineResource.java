package com.data.code.resource;

import com.data.code.service.EngineService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import static org.springframework.http.ResponseEntity.ok;

@Controller
@Api(tags = "Code V1")
public class EngineResource implements EngineApi {

    private final EngineService engineService;

    public EngineResource(EngineService engineService) {
        this.engineService = engineService;
    }

    @Override
    public ResponseEntity<String> add(Object item) {
        return ok("Adicionado com Sucesso");
    }

    @Override
    public ResponseEntity<String> remove(Long id) {
        engineService.remove(id);
        return ok("Removido com Sucesso");
    }

}
