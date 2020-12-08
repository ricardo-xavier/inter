package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1078")
public class Somador1078 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
