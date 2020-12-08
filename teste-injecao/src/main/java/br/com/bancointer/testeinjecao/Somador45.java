package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador45")
public class Somador45 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
