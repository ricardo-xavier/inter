package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1209")
public class Somador1209 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
