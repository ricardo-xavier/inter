package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador129")
public class Somador129 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
