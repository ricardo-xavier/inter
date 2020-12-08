package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador456")
public class Somador456 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
