package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador766")
public class Somador766 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
