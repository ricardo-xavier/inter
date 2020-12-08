package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador669")
public class Somador669 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
