package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1367")
public class Somador1367 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
