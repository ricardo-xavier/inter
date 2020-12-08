package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1416")
public class Somador1416 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
