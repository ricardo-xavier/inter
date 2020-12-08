package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1386")
public class Somador1386 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
