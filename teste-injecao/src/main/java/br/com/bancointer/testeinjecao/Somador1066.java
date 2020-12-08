package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1066")
public class Somador1066 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
