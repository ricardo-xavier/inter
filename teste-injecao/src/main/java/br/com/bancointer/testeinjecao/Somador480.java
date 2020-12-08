package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador480")
public class Somador480 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
