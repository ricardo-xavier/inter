package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1297")
public class Somador1297 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
