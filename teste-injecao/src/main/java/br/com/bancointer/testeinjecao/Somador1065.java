package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1065")
public class Somador1065 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
