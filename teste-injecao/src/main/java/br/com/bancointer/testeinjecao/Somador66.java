package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador66")
public class Somador66 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
