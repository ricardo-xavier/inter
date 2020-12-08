package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador672")
public class Somador672 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
