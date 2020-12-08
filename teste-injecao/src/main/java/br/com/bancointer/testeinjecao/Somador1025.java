package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1025")
public class Somador1025 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
