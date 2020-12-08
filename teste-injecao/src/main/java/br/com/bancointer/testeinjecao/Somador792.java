package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador792")
public class Somador792 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
