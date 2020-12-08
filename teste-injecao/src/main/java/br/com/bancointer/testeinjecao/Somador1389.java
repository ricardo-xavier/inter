package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1389")
public class Somador1389 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
