package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1658")
public class Somador1658 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
