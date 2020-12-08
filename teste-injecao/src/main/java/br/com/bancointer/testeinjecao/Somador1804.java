package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1804")
public class Somador1804 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
