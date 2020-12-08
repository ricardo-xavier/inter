package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1697")
public class Somador1697 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
