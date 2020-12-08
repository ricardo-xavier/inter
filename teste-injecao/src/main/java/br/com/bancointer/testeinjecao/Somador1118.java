package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1118")
public class Somador1118 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
