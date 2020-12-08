package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1162")
public class Somador1162 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
