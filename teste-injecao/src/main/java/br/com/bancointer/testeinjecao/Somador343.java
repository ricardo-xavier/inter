package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador343")
public class Somador343 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
