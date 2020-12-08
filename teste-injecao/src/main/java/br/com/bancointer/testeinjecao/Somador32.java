package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador32")
public class Somador32 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
