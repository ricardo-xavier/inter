package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1945")
public class Somador1945 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
