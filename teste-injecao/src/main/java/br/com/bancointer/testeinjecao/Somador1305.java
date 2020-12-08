package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1305")
public class Somador1305 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
