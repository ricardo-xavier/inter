package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1313")
public class Somador1313 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
