package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1805")
public class Somador1805 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
