package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador846")
public class Somador846 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
