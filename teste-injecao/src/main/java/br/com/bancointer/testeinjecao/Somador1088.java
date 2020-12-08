package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1088")
public class Somador1088 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
