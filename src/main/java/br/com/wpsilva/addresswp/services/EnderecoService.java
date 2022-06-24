package br.com.wpsilva.addresswp.services;

import br.com.wpsilva.addresswp.domain.Endereco;
import br.com.wpsilva.addresswp.exceptions.MyObjNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnderecoService {
    private static final String ENDPOINT = "https://ws.apicep.com/cep.json?code=";

    public Endereco getEndereco(final String cep) {
        RestTemplate rest = new RestTemplate();

        Endereco endereco = rest.getForObject(ENDPOINT + cep, Endereco.class);

        if ("404".equalsIgnoreCase(endereco.getStatus())) {
            throw new MyObjNotFoundException("Endereco nao localizado para o cep informado!");
        }

        return endereco;
    }
}

