package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador40")
public class Somador40 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
