package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador786")
public class Somador786 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
