package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador418")
public class Somador418 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
