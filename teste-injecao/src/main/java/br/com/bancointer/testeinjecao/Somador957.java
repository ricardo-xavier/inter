package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador957")
public class Somador957 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
