package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1285")
public class Somador1285 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
