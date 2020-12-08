package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1616")
public class Somador1616 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
