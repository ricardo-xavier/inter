package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador268")
public class Somador268 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
