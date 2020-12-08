package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1160")
public class Somador1160 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
