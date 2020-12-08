package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador311")
public class Somador311 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
