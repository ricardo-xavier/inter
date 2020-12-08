package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador684")
public class Somador684 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
