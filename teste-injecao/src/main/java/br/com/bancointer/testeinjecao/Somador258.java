package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador258")
public class Somador258 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
