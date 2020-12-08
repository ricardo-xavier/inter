package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1263")
public class Somador1263 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
