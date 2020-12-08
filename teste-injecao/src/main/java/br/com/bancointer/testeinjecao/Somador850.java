package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador850")
public class Somador850 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
