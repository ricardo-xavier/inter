package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador5")
public class Somador5 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
