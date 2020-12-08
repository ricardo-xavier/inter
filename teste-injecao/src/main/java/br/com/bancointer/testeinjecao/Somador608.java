package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador608")
public class Somador608 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
