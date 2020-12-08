package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1487")
public class Somador1487 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
