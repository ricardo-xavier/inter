package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador596")
public class Somador596 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
