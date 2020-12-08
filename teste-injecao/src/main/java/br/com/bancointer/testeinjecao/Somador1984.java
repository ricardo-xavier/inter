package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1984")
public class Somador1984 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
