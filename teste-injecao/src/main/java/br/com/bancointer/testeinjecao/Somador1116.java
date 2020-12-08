package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1116")
public class Somador1116 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
