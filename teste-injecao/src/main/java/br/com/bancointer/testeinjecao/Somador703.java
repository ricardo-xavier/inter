package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador703")
public class Somador703 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
