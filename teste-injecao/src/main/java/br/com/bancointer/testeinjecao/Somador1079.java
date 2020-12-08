package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1079")
public class Somador1079 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
