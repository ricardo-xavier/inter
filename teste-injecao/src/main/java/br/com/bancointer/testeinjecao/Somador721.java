package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador721")
public class Somador721 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
