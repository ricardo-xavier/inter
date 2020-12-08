package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1839")
public class Somador1839 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
