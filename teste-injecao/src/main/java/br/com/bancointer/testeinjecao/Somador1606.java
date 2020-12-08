package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1606")
public class Somador1606 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
