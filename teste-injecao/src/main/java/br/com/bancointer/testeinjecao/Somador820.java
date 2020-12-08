package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador820")
public class Somador820 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
