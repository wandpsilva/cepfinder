package br.com.wpsilva.addresswp.controller;

import br.com.wpsilva.addresswp.domain.Endereco;
import br.com.wpsilva.addresswp.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping(value="/cep/{cep}")
    public ResponseEntity<Endereco> buscarEndereco(@PathVariable String cep){
        return ResponseEntity.ok().body(enderecoService.getEndereco(cep));
    }
}


