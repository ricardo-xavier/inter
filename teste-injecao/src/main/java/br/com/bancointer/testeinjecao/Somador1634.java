package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1634")
public class Somador1634 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
