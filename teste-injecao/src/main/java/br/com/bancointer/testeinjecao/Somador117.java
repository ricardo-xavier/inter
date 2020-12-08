package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador117")
public class Somador117 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
