package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador360")
public class Somador360 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
