package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador286")
public class Somador286 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
