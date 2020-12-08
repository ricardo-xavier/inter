package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1124")
public class Somador1124 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
