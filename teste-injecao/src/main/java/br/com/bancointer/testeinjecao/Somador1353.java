package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1353")
public class Somador1353 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
