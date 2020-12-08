package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1704")
public class Somador1704 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
