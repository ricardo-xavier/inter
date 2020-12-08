package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1409")
public class Somador1409 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
