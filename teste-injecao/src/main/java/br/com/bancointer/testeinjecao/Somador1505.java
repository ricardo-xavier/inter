package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1505")
public class Somador1505 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
