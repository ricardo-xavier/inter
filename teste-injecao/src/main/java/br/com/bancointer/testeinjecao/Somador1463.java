package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1463")
public class Somador1463 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
