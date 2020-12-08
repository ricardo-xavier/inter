package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1183")
public class Somador1183 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
