package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador41")
public class Somador41 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
