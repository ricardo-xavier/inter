package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1280")
public class Somador1280 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
