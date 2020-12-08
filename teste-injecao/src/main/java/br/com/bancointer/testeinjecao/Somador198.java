package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador198")
public class Somador198 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
