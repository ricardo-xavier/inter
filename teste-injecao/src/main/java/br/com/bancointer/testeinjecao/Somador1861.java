package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1861")
public class Somador1861 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
