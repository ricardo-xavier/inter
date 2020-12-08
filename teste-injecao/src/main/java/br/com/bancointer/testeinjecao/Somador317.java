package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador317")
public class Somador317 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
