package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1095")
public class Somador1095 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
