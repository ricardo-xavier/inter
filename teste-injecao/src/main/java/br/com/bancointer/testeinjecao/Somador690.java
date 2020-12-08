package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador690")
public class Somador690 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
