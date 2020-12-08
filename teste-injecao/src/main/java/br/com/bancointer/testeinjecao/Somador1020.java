package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1020")
public class Somador1020 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
