package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador992")
public class Somador992 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
