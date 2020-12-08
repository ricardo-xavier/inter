package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1672")
public class Somador1672 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
