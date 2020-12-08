package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador486")
public class Somador486 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
