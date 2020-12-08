package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador328")
public class Somador328 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
