package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1030")
public class Somador1030 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
