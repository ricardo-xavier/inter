package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador767")
public class Somador767 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
