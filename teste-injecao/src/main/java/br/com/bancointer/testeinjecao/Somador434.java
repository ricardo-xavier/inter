package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador434")
public class Somador434 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
