package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1970")
public class Somador1970 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
