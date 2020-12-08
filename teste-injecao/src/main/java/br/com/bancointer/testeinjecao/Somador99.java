package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador99")
public class Somador99 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
