package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador297")
public class Somador297 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
