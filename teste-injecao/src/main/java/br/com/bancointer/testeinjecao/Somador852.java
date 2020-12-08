package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador852")
public class Somador852 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
