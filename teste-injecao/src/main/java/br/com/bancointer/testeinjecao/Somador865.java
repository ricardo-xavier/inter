package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador865")
public class Somador865 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
