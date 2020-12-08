package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador579")
public class Somador579 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
