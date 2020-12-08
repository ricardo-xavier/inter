package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1096")
public class Somador1096 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
