package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador979")
public class Somador979 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
