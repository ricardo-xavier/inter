package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1549")
public class Somador1549 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
