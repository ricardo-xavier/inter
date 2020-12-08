package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador459")
public class Somador459 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
