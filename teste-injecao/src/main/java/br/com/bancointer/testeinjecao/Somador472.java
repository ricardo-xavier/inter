package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador472")
public class Somador472 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
