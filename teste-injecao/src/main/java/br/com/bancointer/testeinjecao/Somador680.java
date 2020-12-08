package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador680")
public class Somador680 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
