package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1339")
public class Somador1339 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
