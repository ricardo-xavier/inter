package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador555")
public class Somador555 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
