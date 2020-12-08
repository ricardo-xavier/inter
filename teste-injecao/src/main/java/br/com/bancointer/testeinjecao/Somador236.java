package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador236")
public class Somador236 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
