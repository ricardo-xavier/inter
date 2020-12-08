package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador277")
public class Somador277 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
