package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1744")
public class Somador1744 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
