package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador622")
public class Somador622 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
