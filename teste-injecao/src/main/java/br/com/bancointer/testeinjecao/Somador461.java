package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador461")
public class Somador461 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
