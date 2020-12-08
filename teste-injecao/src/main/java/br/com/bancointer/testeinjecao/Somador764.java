package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador764")
public class Somador764 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
