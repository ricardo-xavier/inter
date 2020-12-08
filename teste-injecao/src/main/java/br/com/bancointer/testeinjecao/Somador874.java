package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador874")
public class Somador874 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
