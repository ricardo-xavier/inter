package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador500")
public class Somador500 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
