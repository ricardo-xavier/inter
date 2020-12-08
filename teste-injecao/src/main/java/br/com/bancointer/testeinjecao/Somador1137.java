package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1137")
public class Somador1137 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
