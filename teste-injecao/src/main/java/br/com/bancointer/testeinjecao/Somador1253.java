package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1253")
public class Somador1253 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
