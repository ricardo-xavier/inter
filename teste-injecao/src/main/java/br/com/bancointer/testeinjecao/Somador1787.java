package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1787")
public class Somador1787 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
