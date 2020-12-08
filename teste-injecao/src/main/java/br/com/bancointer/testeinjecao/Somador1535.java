package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1535")
public class Somador1535 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
