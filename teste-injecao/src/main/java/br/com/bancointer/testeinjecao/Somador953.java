package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador953")
public class Somador953 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
