package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1365")
public class Somador1365 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
