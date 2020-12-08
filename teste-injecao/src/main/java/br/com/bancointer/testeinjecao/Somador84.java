package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador84")
public class Somador84 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
