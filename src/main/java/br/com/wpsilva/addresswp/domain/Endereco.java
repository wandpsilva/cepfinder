package br.com.wpsilva.addresswp.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Endereco {
    private String status;
    private String ok;
    private String code;
    private String state;
    private String city;
    private String district;
    private String address;
    private String statusText;
}

