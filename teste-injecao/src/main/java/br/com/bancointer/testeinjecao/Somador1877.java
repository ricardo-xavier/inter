package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1877")
public class Somador1877 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
