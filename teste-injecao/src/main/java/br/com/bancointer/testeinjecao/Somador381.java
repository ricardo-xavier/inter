package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador381")
public class Somador381 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
