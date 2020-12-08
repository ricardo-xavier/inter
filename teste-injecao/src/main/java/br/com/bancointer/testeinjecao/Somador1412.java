package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1412")
public class Somador1412 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
