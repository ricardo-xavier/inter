package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1106")
public class Somador1106 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
