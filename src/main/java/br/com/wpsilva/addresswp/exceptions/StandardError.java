package br.com.wpsilva.addresswp.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StandardError {
    private Integer status;
    private String message;

    public StandardError(Integer status, String msg) {
        this.status = status;
        this.message = msg;
    }
}
