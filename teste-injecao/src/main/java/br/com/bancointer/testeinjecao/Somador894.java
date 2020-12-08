package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador894")
public class Somador894 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
