package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador819")
public class Somador819 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
