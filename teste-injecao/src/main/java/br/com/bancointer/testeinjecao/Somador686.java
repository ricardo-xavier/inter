package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador686")
public class Somador686 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
