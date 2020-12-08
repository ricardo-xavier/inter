package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador810")
public class Somador810 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
