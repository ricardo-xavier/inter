package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador189")
public class Somador189 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
