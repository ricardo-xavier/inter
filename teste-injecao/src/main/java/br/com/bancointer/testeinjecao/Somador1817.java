package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1817")
public class Somador1817 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
