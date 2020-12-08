package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1001")
public class Somador1001 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
