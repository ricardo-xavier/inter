package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1570")
public class Somador1570 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
