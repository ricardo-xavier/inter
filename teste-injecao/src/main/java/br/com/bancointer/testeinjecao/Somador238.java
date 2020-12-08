package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador238")
public class Somador238 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
