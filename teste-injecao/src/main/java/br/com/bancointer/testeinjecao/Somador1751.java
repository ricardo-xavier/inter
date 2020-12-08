package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1751")
public class Somador1751 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
