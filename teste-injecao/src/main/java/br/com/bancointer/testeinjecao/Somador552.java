package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador552")
public class Somador552 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
