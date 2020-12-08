package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1693")
public class Somador1693 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
