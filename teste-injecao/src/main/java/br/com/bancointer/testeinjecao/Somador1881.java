package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1881")
public class Somador1881 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
