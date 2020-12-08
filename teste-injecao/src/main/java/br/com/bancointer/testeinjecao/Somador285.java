package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador285")
public class Somador285 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
