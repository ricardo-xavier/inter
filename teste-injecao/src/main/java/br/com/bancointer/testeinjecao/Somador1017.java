package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1017")
public class Somador1017 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
