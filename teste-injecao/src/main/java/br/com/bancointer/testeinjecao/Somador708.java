package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador708")
public class Somador708 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
