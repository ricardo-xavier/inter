package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador160")
public class Somador160 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
