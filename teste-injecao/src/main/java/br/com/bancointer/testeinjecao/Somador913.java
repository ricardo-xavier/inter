package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador913")
public class Somador913 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
