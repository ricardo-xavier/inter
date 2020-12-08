package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1089")
public class Somador1089 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
