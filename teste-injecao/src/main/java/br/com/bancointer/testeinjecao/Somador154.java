package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador154")
public class Somador154 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
