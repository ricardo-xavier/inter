package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador776")
public class Somador776 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
