package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1156")
public class Somador1156 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
