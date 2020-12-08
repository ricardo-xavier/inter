package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1016")
public class Somador1016 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
