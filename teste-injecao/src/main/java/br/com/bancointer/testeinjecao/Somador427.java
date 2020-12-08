package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador427")
public class Somador427 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
