package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1694")
public class Somador1694 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
