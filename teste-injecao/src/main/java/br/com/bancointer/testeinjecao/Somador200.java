package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador200")
public class Somador200 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
