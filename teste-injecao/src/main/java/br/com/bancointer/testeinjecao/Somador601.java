package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador601")
public class Somador601 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
