package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador550")
public class Somador550 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
