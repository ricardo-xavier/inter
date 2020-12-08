package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador300")
public class Somador300 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
