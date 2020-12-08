package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1792")
public class Somador1792 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
