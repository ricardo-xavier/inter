package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1080")
public class Somador1080 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
