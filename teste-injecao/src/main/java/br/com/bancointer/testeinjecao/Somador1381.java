package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1381")
public class Somador1381 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
