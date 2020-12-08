package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador203")
public class Somador203 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
