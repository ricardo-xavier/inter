package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1667")
public class Somador1667 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
