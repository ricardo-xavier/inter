package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador501")
public class Somador501 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
