package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador715")
public class Somador715 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
