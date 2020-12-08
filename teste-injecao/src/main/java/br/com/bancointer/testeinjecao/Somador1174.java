package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1174")
public class Somador1174 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
