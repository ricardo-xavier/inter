package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador478")
public class Somador478 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
