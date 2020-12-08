package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador289")
public class Somador289 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
