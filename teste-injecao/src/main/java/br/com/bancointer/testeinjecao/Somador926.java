package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador926")
public class Somador926 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
